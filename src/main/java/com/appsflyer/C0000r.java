package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.UUID;

/* renamed from: com.appsflyer.r */
final class C0000r {
    /* renamed from: ˋ */
    private static String f164;

    C0000r() {
    }

    /* renamed from: ˏ */
    public static synchronized String m104(WeakReference<Context> weakReference) {
        synchronized (C0000r.class) {
            String str;
            if (weakReference.get() == null) {
                str = f164;
                return str;
            }
            if (f164 == null) {
                String str2 = null;
                if (weakReference.get() != null) {
                    str2 = AppsFlyerLib.m181((Context) weakReference.get()).getString("AF_INSTALLATION", null);
                }
                if (str2 != null) {
                    f164 = str2;
                } else {
                    try {
                        String obj;
                        File file = new File(((Context) weakReference.get()).getFilesDir(), "AF_INSTALLATION");
                        if (file.exists()) {
                            f164 = C0000r.m103(file);
                            file.delete();
                        } else {
                            if (VERSION.SDK_INT >= 9) {
                                long currentTimeMillis = System.currentTimeMillis();
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(currentTimeMillis);
                                stringBuilder.append("-");
                                stringBuilder.append(Math.abs(new SecureRandom().nextLong()));
                                obj = stringBuilder.toString();
                            } else {
                                obj = UUID.randomUUID().toString();
                            }
                            f164 = obj;
                        }
                        obj = f164;
                        Editor edit = AppsFlyerLib.m181((Context) weakReference.get()).edit();
                        edit.putString("AF_INSTALLATION", obj);
                        if (VERSION.SDK_INT >= 9) {
                            edit.apply();
                        } else {
                            edit.commit();
                        }
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e);
                    }
                }
                if (f164 != null) {
                    AppsFlyerProperties.getInstance().set("uid", f164);
                }
            }
            str = f164;
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0038 A:{SYNTHETIC, Splitter:B:24:0x0038} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0051 A:{SYNTHETIC, Splitter:B:35:0x0051} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0038 A:{SYNTHETIC, Splitter:B:24:0x0038} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A:{Splitter:B:3:0x0008, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:11:0x0020, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:12:0x0021, code skipped:
            r4 = r1;
            r1 = r5;
            r5 = r0;
     */
    /* JADX WARNING: Missing block: B:13:0x0025, code skipped:
            r5 = th;
     */
    /* JADX WARNING: Missing block: B:14:0x0026, code skipped:
            r0 = r1;
     */
    /* JADX WARNING: Missing block: B:25:?, code skipped:
            r0.close();
     */
    /* JADX WARNING: Missing block: B:26:0x003c, code skipped:
            r5 = move-exception;
     */
    /* JADX WARNING: Missing block: B:27:0x003d, code skipped:
            com.appsflyer.AFLogger.afErrorLog("Exception while trying to close the InstallationFile", r5);
     */
    /* JADX WARNING: Missing block: B:36:?, code skipped:
            r0.close();
     */
    /* JADX WARNING: Missing block: B:37:0x0055, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:38:0x0056, code skipped:
            com.appsflyer.AFLogger.afErrorLog("Exception while trying to close the InstallationFile", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: ˊ */
    private static String m103(File file) {
        byte[] bArr;
        Throwable e;
        byte[] bArr2;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                bArr = new byte[((int) randomAccessFile2.length())];
                randomAccessFile2.readFully(bArr);
                randomAccessFile2.close();
                try {
                    randomAccessFile2.close();
                } catch (IOException e2) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e2);
                }
            } catch (IOException e3) {
                e = e3;
                RandomAccessFile randomAccessFile3 = randomAccessFile2;
                bArr2 = null;
                randomAccessFile = randomAccessFile3;
                try {
                    AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
                    if (randomAccessFile != null) {
                    }
                    bArr = bArr2;
                    if (bArr == null) {
                    }
                    return new String(bArr);
                } catch (Throwable th) {
                    e = th;
                    if (randomAccessFile != null) {
                    }
                    throw e;
                }
            } catch (Throwable th2) {
            }
        } catch (IOException e4) {
            e = e4;
            bArr2 = null;
            AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
            if (randomAccessFile != null) {
            }
            bArr = bArr2;
            if (bArr == null) {
            }
            return new String(bArr);
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new String(bArr);
    }
}
