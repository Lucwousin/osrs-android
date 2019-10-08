package com.appsflyer;

import android.content.Context;
import android.os.Build$VERSION;
import android.os.Build;
import android.security.KeyPairGeneratorSpec$Builder;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec$Builder;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyPairGeneratorSpi;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

class AFKeystoreWrapper {
    private String ˊ;
    private Context ˋ;
    private KeyStore ˎ;
    private final Object ˏ;
    private int ॱ;

    public AFKeystoreWrapper(Context arg2) {
        super();
        this.ˏ = new Object();
        this.ˋ = arg2;
        this.ˊ = "";
        this.ॱ = 0;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            this.ˎ = KeyStore.getInstance("AndroidKeyStore");
            this.ˎ.load(null);
            return;
        }
        catch(KeyStoreException v2) {
            AFLogger.afErrorLog("Couldn\'t load keystore instance of type: AndroidKeyStore", ((Throwable)v2));
            return;
        }
    }

    final void ˊ() {
        Object v2;
        String v0 = this.ˏ();
        Object v1 = this.ˏ;
        __monitor_enter(v1);
        try {
            ++this.ॱ;
            AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(v0)));
            try {
                v2 = this.ˏ;
                __monitor_enter(v2);
            }
            catch(KeyStoreException v0_2) {
                goto label_20;
            }
        }
        catch(Throwable v0_1) {
            goto label_34;
        }

        try {
            this.ˎ.deleteEntry(v0);
            __monitor_exit(v2);
            goto label_29;
        }
        catch(Throwable v0_1) {
            try {
                __monitor_exit(v2);
                throw v0_1;
            }
            catch(Throwable v0_1) {
            }
            catch(KeyStoreException v0_2) {
                try {
                label_20:
                    StringBuilder v2_1 = new StringBuilder("Exception ");
                    v2_1.append(((Throwable)v0_2).getMessage());
                    v2_1.append(" occurred");
                    AFLogger.afErrorLog(v2_1.toString(), ((Throwable)v0_2));
                label_29:
                    __monitor_exit(v1);
                }
                catch(Throwable v0_1) {
                label_34:
                    __monitor_exit(v1);
                    throw v0_1;
                }
            }
        }

        this.ˎ(this.ˏ());
    }

    final int ˋ() {
        Object v0 = this.ˏ;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return this.ॱ;
        }
        catch(Throwable v1) {
            __monitor_exit(v0);
            throw v1;
        }
    }

    private void ˎ(String arg7) {
        KeyPairGeneratorSpec v2_2;
        Object v3;
        Calendar v1;
        Calendar v0;
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(arg7)));
        try {
            v0 = Calendar.getInstance();
            v1 = Calendar.getInstance();
            v1.add(1, 5);
            AlgorithmParameterSpec v2 = null;
            v3 = this.ˏ;
            __monitor_enter(v3);
        }
        catch(Throwable v7) {
            goto label_73;
        }

        try {
            if(!this.ˎ.containsAlias(arg7)) {
                if(Build$VERSION.SDK_INT >= 23) {
                    KeyGenParameterSpec v2_1 = new KeyGenParameterSpec$Builder(arg7, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(v0.getTime()).setCertificateNotAfter(v1.getTime()).build();
                }
                else if(Build$VERSION.SDK_INT >= 18 && !"OPPO".equals(Build.BRAND)) {
                    v2_2 = new KeyPairGeneratorSpec$Builder(this.ˋ).setAlias(arg7).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(v0.getTime()).setEndDate(v1.getTime()).build();
                }

                KeyPairGenerator v7_1 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                v7_1.initialize(((AlgorithmParameterSpec)v2_2));
                ((KeyPairGeneratorSpi)v7_1).generateKeyPair();
            }
            else {
                AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(arg7)));
            }

            __monitor_exit(v3);
            return;
        }
        catch(Throwable v7) {
            try {
                __monitor_exit(v3);
                throw v7;
            }
            catch(Throwable v7) {
            label_73:
                StringBuilder v0_1 = new StringBuilder("Exception ");
                v0_1.append(v7.getMessage());
                v0_1.append(" occurred");
                AFLogger.afErrorLog(v0_1.toString(), v7);
                return;
            }
        }
    }

    final boolean ˎ() {
        String[] v1_2;
        Object v4;
        boolean v2;
        Object v0 = this.ˏ;
        __monitor_enter(v0);
        try {
            v2 = true;
            if(this.ˎ != null) {
                try {
                    Enumeration v1_1 = this.ˎ.aliases();
                    do {
                        if(v1_1.hasMoreElements()) {
                            v4 = v1_1.nextElement();
                            if(v4 == null) {
                                continue;
                            }

                            if(!((String)v4).startsWith("com.appsflyer")) {
                                continue;
                            }

                            break;
                        }

                        goto label_58;
                    }
                    while(true);

                    v1_2 = ((String)v4).split(",");
                    if(v1_2.length == 3) {
                        AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(String.valueOf(v4)));
                        goto label_24;
                    }

                    goto label_58;
                }
                catch(Throwable v1) {
                    goto label_48;
                }

                try {
                label_24:
                    String[] v3 = v1_2[1].trim().split("=");
                    int v4_1 = 2;
                    v1_2 = v1_2[v4_1].trim().split("=");
                    if(v3.length != v4_1) {
                    }
                    else if(v1_2.length == v4_1) {
                        this.ˊ = v3[1].trim();
                        this.ॱ = Integer.parseInt(v1_2[1].trim());
                    }
                    else {
                    }

                    goto label_59;
                }
                catch(Throwable v1) {
                    goto label_49;
                }
            }

            goto label_58;
        }
        catch(Throwable v1) {
            goto label_62;
        }

    label_48:
        v2 = false;
        try {
        label_49:
            StringBuilder v3_1 = new StringBuilder("Couldn\'t list KeyStore Aliases: ");
            v3_1.append(v1.getClass().getName());
            AFLogger.afErrorLog(v3_1.toString(), v1);
            goto label_59;
        label_58:
            v2 = false;
        label_59:
            __monitor_exit(v0);
            return v2;
        }
        catch(Throwable v1) {
        label_62:
            __monitor_exit(v0);
            throw v1;
        }
    }

    private String ˏ() {
        StringBuilder v0 = new StringBuilder();
        v0.append("com.appsflyer,");
        Object v1 = this.ˏ;
        __monitor_enter(v1);
        try {
            v0.append("KSAppsFlyerId=");
            v0.append(this.ˊ);
            v0.append(",");
            v0.append("KSAppsFlyerRICounter=");
            v0.append(this.ॱ);
            __monitor_exit(v1);
        }
        catch(Throwable v0_1) {
            __monitor_exit(v1);
            throw v0_1;
        }

        return v0.toString();
    }

    final String ॱ() {
        Object v0 = this.ˏ;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return this.ˊ;
        }
        catch(Throwable v1) {
            __monitor_exit(v0);
            throw v1;
        }
    }

    final void ॱ(String arg1) {
        this.ˊ = arg1;
        this.ॱ = 0;
        this.ˎ(this.ˏ());
    }
}

