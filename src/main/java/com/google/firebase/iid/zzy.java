package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import com.google.android.gms.internal.firebase_messaging.zzh;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

final class zzy {
    zzy() {
        super();
    }

    static void zza(Context arg5) {
        File[] v5 = zzy.zzb(arg5).listFiles();
        int v0 = v5.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            File v2 = v5[v1];
            if(v2.getName().startsWith("com.google.InstanceId")) {
                v2.delete();
            }
        }
    }

    @Nullable private final zzz zza(Context arg9, String arg10, zzz arg11, boolean arg12) {
        Throwable v7;
        zzz v12_1;
        long v3;
        FileChannel v9_3;
        RandomAccessFile v2;
        int v1 = 3;
        if(Log.isLoggable("FirebaseInstanceId", v1)) {
            Log.d("FirebaseInstanceId", "Writing key to properties file");
        }

        Properties v0 = new Properties();
        v0.setProperty("pub", zzz.zza(arg11));
        v0.setProperty("pri", zzz.zzb(arg11));
        v0.setProperty("cre", String.valueOf(zzz.zzc(arg11)));
        File v9 = zzy.zzf(arg9, arg10);
        Throwable v10 = null;
        try {
            v9.createNewFile();
            v2 = new RandomAccessFile(v9, "rw");
        }
        catch(IOException v9_1) {
            goto label_85;
        }

        try {
            v9_3 = v2.getChannel();
        }
        catch(Throwable v9_2) {
            goto label_73;
        }
        catch(Throwable v9_2) {
            goto label_76;
        }

        try {
            v9_3.lock();
            v3 = 0;
            if(!arg12) {
                goto label_53;
            }

            if(v9_3.size() <= v3) {
                goto label_53;
            }

            try {
                v9_3.position(v3);
                v12_1 = zzy.zza(v9_3);
                if(v9_3 == null) {
                    goto label_35;
                }
            }
            catch(zzaa v12) {
                try {
                    if(Log.isLoggable("FirebaseInstanceId", v1)) {
                        String v12_2 = String.valueOf(v12);
                        StringBuilder v6 = new StringBuilder(String.valueOf(v12_2).length() + 0x40);
                        v6.append("Tried reading key pair before writing new one, but failed with: ");
                        v6.append(v12_2);
                        Log.d("FirebaseInstanceId", v6.toString());
                    }
                    else {
                    }

                    goto label_53;
                }
                catch(Throwable v11) {
                    goto label_61;
                }
                catch(Throwable v11) {
                    goto label_64;
                }
            }
        }
        catch(Throwable v11) {
            goto label_61;
        }
        catch(Throwable v11) {
            goto label_64;
        }

        try {
            zzy.zza(v10, v9_3);
        }
        catch(Throwable v9_2) {
            goto label_73;
        }
        catch(Throwable v9_2) {
            goto label_76;
        }

        try {
        label_35:
            zzy.zza(v10, v2);
            return v12_1;
        }
        catch(IOException v9_1) {
            goto label_85;
        }

        try {
        label_53:
            v9_3.position(v3);
            v0.store(Channels.newOutputStream(((WritableByteChannel)v9_3)), ((String)v10));
            if(v9_3 == null) {
                goto label_58;
            }

            goto label_57;
        }
        catch(Throwable v11) {
        label_61:
            v12_3 = v10;
        }
        catch(Throwable v11) {
            try {
            label_64:
                throw v11;
            }
            catch(Throwable v12_3) {
                v7 = v12_3;
                v12_3 = v11;
                v11 = v7;
            }
        }

        if(v9_3 != null) {
            try {
                zzy.zza(v12_3, v9_3);
            label_71:
                throw v11;
            label_57:
                zzy.zza(v10, v9_3);
                goto label_58;
            }
            catch(Throwable v9_2) {
            label_73:
                v11 = v10;
                goto label_81;
            }
            catch(Throwable v9_2) {
                try {
                label_76:
                    throw v9_2;
                }
                catch(Throwable v11) {
                    v7 = v11;
                    v11 = v9_2;
                    v9_2 = v7;
                    goto label_81;
                }
            }
        }

        goto label_71;
        try {
        label_81:
            zzy.zza(v11, v2);
            throw v9_2;
        label_58:
            zzy.zza(v10, v2);
            return arg11;
        }
        catch(IOException v9_1) {
        label_85:
            String v9_4 = String.valueOf(v9_1);
            StringBuilder v0_1 = new StringBuilder(String.valueOf(v9_4).length() + 21);
            v0_1.append("Failed to write key: ");
            v0_1.append(v9_4);
            Log.w("FirebaseInstanceId", v0_1.toString());
            return ((zzz)v10);
        }
    }

    private static zzz zza(FileChannel arg3) throws zzaa, IOException {
        long v0_1;
        Properties v0 = new Properties();
        v0.load(Channels.newInputStream(((ReadableByteChannel)arg3)));
        String v3 = v0.getProperty("pub");
        String v1 = v0.getProperty("pri");
        if(v3 != null && v1 != null) {
            KeyPair v3_1 = zzy.zzc(v3, v1);
            try {
                v0_1 = Long.parseLong(v0.getProperty("cre"));
            }
            catch(NumberFormatException v3_2) {
                throw new zzaa(((Exception)v3_2));
            }

            return new zzz(v3_1, v0_1);
        }

        throw new zzaa("Invalid properties file");
    }

    private static void zza(Throwable arg0, FileChannel arg1) {
        if(arg0 != null) {
            try {
                arg1.close();
                return;
            }
            catch(Throwable v1) {
                zzh.zza(arg0, v1);
                return;
            }
        }

        arg1.close();
    }

    private static void zza(Throwable arg0, RandomAccessFile arg1) {
        if(arg0 != null) {
            try {
                arg1.close();
                return;
            }
            catch(Throwable v1) {
                zzh.zza(arg0, v1);
                return;
            }
        }

        arg1.close();
    }

    @Nullable private static zzz zza(SharedPreferences arg3, String arg4) throws zzaa {
        String v1 = null;
        String v0 = arg3.getString(zzaw.zzd(arg4, "|P|"), v1);
        String v2 = arg3.getString(zzaw.zzd(arg4, "|K|"), v1);
        if(v0 != null) {
            if(v2 == null) {
            }
            else {
                return new zzz(zzy.zzc(v0, v2), zzy.zzb(arg3, arg4));
            }
        }

        return ((zzz)v1);
    }

    private final zzz zza(File arg10) throws zzaa, IOException {
        zzz v1_2;
        FileChannel v1_1;
        long v4;
        long v2;
        FileChannel v7;
        FileInputStream v0 = new FileInputStream(arg10);
        Throwable v10 = null;
        try {
            v7 = v0.getChannel();
            v2 = 0;
            v4 = 0x7FFFFFFFFFFFFFFFL;
            v1_1 = v7;
        }
        catch(Throwable v1) {
            goto label_30;
        }
        catch(Throwable v10) {
            goto label_29;
        }

        try {
            v1_1.lock(v2, v4, true);
            v1_2 = zzy.zza(v7);
            if(v7 == null) {
                goto label_12;
            }

            goto label_11;
        }
        catch(Throwable v1) {
            v2_1 = v10;
        }
        catch(Throwable v1) {
            try {
                throw v1;
            }
            catch(Throwable v2_1) {
                Throwable v8 = v2_1;
                v2_1 = v1;
                v1 = v8;
            }
        }

        if(v7 != null) {
            try {
                zzy.zza(v2_1, v7);
            label_25:
                throw v1;
            label_11:
                zzy.zza(v10, v7);
                goto label_12;
            }
            catch(Throwable v1) {
            }
            catch(Throwable v10) {
                try {
                label_29:
                    throw v10;
                }
                catch(Throwable v1) {
                label_30:
                    zzy.zza(v10, v0);
                    throw v1;
                }
            }
        }

        goto label_25;
    label_12:
        zzy.zza(v10, v0);
        return v1_2;
    }

    private static void zza(Throwable arg0, FileInputStream arg1) {
        if(arg0 != null) {
            try {
                arg1.close();
                return;
            }
            catch(Throwable v1) {
                zzh.zza(arg0, v1);
                return;
            }
        }

        arg1.close();
    }

    private final void zza(Context arg3, String arg4, zzz arg5) {
        SharedPreferences v3 = arg3.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if(!arg5.equals(zzy.zza(v3, arg4))) {
                goto label_7;
            }
        }
        catch(zzaa ) {
            goto label_7;
        }

        return;
    label_7:
        if(Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }

        SharedPreferences$Editor v3_1 = v3.edit();
        v3_1.putString(zzaw.zzd(arg4, "|P|"), zzz.zza(arg5));
        v3_1.putString(zzaw.zzd(arg4, "|K|"), zzz.zzb(arg5));
        v3_1.putString(zzaw.zzd(arg4, "cre"), String.valueOf(zzz.zzc(arg5)));
        v3_1.commit();
    }

    @WorkerThread final zzz zzb(Context arg2, String arg3) throws zzaa {
        zzz v0 = this.zzd(arg2, arg3);
        if(v0 != null) {
            return v0;
        }

        return this.zzc(arg2, arg3);
    }

    private static long zzb(SharedPreferences arg1, String arg2) {
        String v1 = arg1.getString(zzaw.zzd(arg2, "cre"), null);
        if(v1 == null) {
            return 0;
        }

        try {
            return Long.parseLong(v1);
        }
        catch(NumberFormatException ) {
            return 0;
        }
    }

    private static File zzb(Context arg2) {
        File v0 = ContextCompat.getNoBackupFilesDir(arg2);
        if(v0 != null && (v0.isDirectory())) {
            return v0;
        }

        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn\'t exist, using regular files directory instead");
        return arg2.getFilesDir();
    }

    @WorkerThread final zzz zzc(Context arg5, String arg6) {
        zzz v0 = new zzz(zza.zzc(), System.currentTimeMillis());
        zzz v1 = this.zza(arg5, arg6, v0, true);
        int v2 = 3;
        if(v1 != null && !v1.equals(v0)) {
            if(Log.isLoggable("FirebaseInstanceId", v2)) {
                Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
            }

            return v1;
        }

        if(Log.isLoggable("FirebaseInstanceId", v2)) {
            Log.d("FirebaseInstanceId", "Generated new key");
        }

        this.zza(arg5, arg6, v0);
        return v0;
    }

    private static KeyPair zzc(String arg2, String arg3) throws zzaa {
        byte[] v3;
        byte[] v2_1;
        int v0 = 8;
        try {
            v2_1 = Base64.decode(arg2, v0);
            v3 = Base64.decode(arg3, v0);
        }
        catch(IllegalArgumentException v2) {
            throw new zzaa(((Exception)v2));
        }

        try {
            KeyFactory v0_1 = KeyFactory.getInstance("RSA");
            return new KeyPair(v0_1.generatePublic(new X509EncodedKeySpec(v2_1)), v0_1.generatePrivate(new PKCS8EncodedKeySpec(v3)));
        }
        catch(NoSuchAlgorithmException v2_2) {
            arg3 = String.valueOf(v2_2);
            StringBuilder v1 = new StringBuilder(String.valueOf(arg3).length() + 19);
            v1.append("Invalid key stored ");
            v1.append(arg3);
            Log.w("FirebaseInstanceId", v1.toString());
            throw new zzaa(((Exception)v2_2));
        }
    }

    @Nullable private final zzz zzd(Context arg5, String arg6) throws zzaa {
        zzz v0 = null;
        try {
            zzz v1_1 = this.zze(arg5, arg6);
            if(v1_1 == null) {
                goto label_5;
            }

            this.zza(arg5, arg6, v1_1);
            return v1_1;
        }
        catch(zzaa v1) {
            goto label_8;
        }

    label_5:
        v1 = ((zzaa)v0);
        try {
        label_8:
            zzz v2 = zzy.zza(arg5.getSharedPreferences("com.google.android.gms.appid", 0), arg6);
            if(v2 == null) {
                goto label_17;
            }

            this.zza(arg5, arg6, v2, false);
            return v2;
        }
        catch(zzaa v5) {
            v1 = v5;
        }

    label_17:
        if(v1 == null) {
            return v0;
        }

        throw v1;
    }

    @Nullable private final zzz zze(Context arg4, String arg5) throws zzaa {
        File v4 = zzy.zzf(arg4, arg5);
        if(!v4.exists()) {
            return null;
        }

        try {
            return this.zza(v4);
        }
        catch(IOException v5) {
            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                arg5 = String.valueOf(v5);
                StringBuilder v2 = new StringBuilder(String.valueOf(arg5).length() + 40);
                v2.append("Failed to read key from file, retrying: ");
                v2.append(arg5);
                Log.d("FirebaseInstanceId", v2.toString());
            }

            try {
                return this.zza(v4);
            }
            catch(IOException v4_1) {
                arg5 = String.valueOf(v4_1);
                StringBuilder v1 = new StringBuilder(String.valueOf(arg5).length() + 45);
                v1.append("IID file exists, but failed to read from it: ");
                v1.append(arg5);
                Log.w("FirebaseInstanceId", v1.toString());
                throw new zzaa(((Exception)v4_1));
            }
        }
    }

    private static File zzf(Context arg2, String arg3) {
        if(TextUtils.isEmpty(((CharSequence)arg3))) {
            arg3 = "com.google.InstanceId.properties";
        }
        else {
            try {
                arg3 = Base64.encodeToString(arg3.getBytes("UTF-8"), 11);
                StringBuilder v1 = new StringBuilder(String.valueOf(arg3).length() + 33);
                v1.append("com.google.InstanceId_");
                v1.append(arg3);
                v1.append(".properties");
                arg3 = v1.toString();
            }
            catch(UnsupportedEncodingException v2) {
                throw new AssertionError(v2);
            }
        }

        return new File(zzy.zzb(arg2), arg3);
    }
}

