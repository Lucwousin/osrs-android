package com.google.firebase.iid;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public final class zza {
    public static KeyPair zzc() {
        try {
            KeyPairGenerator v0_1 = KeyPairGenerator.getInstance("RSA");
            v0_1.initialize(0x800);
            return v0_1.generateKeyPair();
        }
        catch(NoSuchAlgorithmException v0) {
            throw new AssertionError(v0);
        }
    }
}

