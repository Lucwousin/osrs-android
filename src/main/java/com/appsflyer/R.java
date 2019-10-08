package com.appsflyer;

import android.content.SharedPreferences$Editor;
import android.os.Build$VERSION;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.UUID;

final class r {
    private static String ˋ;

    static {
    }

    r() {
        super();
    }

    private static String ˊ(File arg5) {
        RandomAccessFile v4;
        byte[] v5_2;
        byte[] v1_1;
        RandomAccessFile v1;
        RandomAccessFile v0 = null;
        try {
            v1 = new RandomAccessFile(arg5, "r");
            goto label_4;
        }
        catch(Throwable v5) {
        }
        catch(IOException v5_1) {
            v1_1 = ((byte[])v0);
            goto label_32;
            try {
            label_4:
                v5_2 = new byte[((int)v1.length())];
            }
            catch(IOException v5_1) {
                v4 = v1;
                v1_1 = ((byte[])v0);
                goto label_26;
            }

            try {
                v1.readFully(v5_2);
                v1.close();
                goto label_9;
            }
            catch(IOException v0_1) {
                v4 = v1;
                v1_1 = v5_2;
                v5_1 = v0_1;
            }

        label_26:
            v0 = v4;
            try {
            label_32:
                AFLogger.afErrorLog("Exception while reading InstallationFile: ", ((Throwable)v5_1));
                if(v0 == null) {
                    goto label_40;
                }
            }
            catch(Throwable v5) {
                goto label_48;
            }
        }

        try {
            v0.close();
        }
        catch(IOException v5_1) {
            AFLogger.afErrorLog("Exception while trying to close the InstallationFile", ((Throwable)v5_1));
        }

    label_40:
        v5_2 = v1_1;
        goto label_41;
        v0 = v1;
    label_48:
        if(v0 != null) {
            try {
                v0.close();
            }
            catch(IOException v0_1) {
                AFLogger.afErrorLog("Exception while trying to close the InstallationFile", ((Throwable)v0_1));
            }
        }

        throw v5;
        try {
        label_9:
            v1.close();
        }
        catch(IOException v0_1) {
            AFLogger.afErrorLog("Exception while trying to close the InstallationFile", ((Throwable)v0_1));
        }

    label_41:
        if(v5_2 != null) {
        }
        else {
            v5_2 = new byte[0];
        }

        return new String(v5_2);
    }

    public static String ˏ(WeakReference arg5) {
        String v1_2;
        String v5_1;
        Class v0 = r.class;
        __monitor_enter(v0);
        try {
            if(((Reference)arg5).get() != null) {
                goto label_7;
            }

            v5_1 = r.ˋ;
        }
        catch(Throwable v5) {
            goto label_75;
        }

        __monitor_exit(v0);
        return v5_1;
        try {
        label_7:
            if(r.ˋ != null) {
                goto label_71;
            }

            String v2 = null;
            if(((Reference)arg5).get() == null) {
            }
            else {
                v2 = AppsFlyerLib.ˎ(((Reference)arg5).get()).getString("AF_INSTALLATION", v2);
            }

            if(v2 != null) {
                r.ˋ = v2;
                goto label_65;
            }

            try {
                File v1 = new File(((Reference)arg5).get().getFilesDir(), "AF_INSTALLATION");
                int v3 = 9;
                if(!v1.exists()) {
                    if(Build$VERSION.SDK_INT >= v3) {
                        long v1_1 = System.currentTimeMillis();
                        v1_2 = v1_1 + "-" + Math.abs(new SecureRandom().nextLong());
                    }
                    else {
                        v1_2 = UUID.randomUUID().toString();
                    }

                    r.ˋ = v1_2;
                }
                else {
                    r.ˋ = r.ˊ(v1);
                    v1.delete();
                }

                v1_2 = r.ˋ;
                SharedPreferences$Editor v5_3 = AppsFlyerLib.ˎ(((Reference)arg5).get()).edit();
                v5_3.putString("AF_INSTALLATION", v1_2);
                if(Build$VERSION.SDK_INT >= v3) {
                    v5_3.apply();
                    goto label_65;
                }

                v5_3.commit();
                goto label_65;
            }
            catch(Exception v5_2) {
                try {
                    AFLogger.afErrorLog("Error getting AF unique ID", ((Throwable)v5_2));
                label_65:
                    if(r.ˋ != null) {
                        AppsFlyerProperties.getInstance().set("uid", r.ˋ);
                    }

                label_71:
                    v5_1 = r.ˋ;
                }
                catch(Throwable v5) {
                label_75:
                    __monitor_exit(v0);
                    throw v5;
                }
            }
        }
        catch(Throwable v5) {
            goto label_75;
        }

        __monitor_exit(v0);
        return v5_1;
    }
}

