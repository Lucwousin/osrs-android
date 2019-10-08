package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager$AuthenticationResult;
import android.hardware.fingerprint.FingerprintManager$CryptoObject;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build$VERSION;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.core.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class FingerprintManagerCompat {
    public abstract class AuthenticationCallback {
        public AuthenticationCallback() {
            super();
        }

        public void onAuthenticationError(int arg1, CharSequence arg2) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int arg1, CharSequence arg2) {
        }

        public void onAuthenticationSucceeded(AuthenticationResult arg1) {
        }
    }

    public final class AuthenticationResult {
        private final CryptoObject mCryptoObject;

        public AuthenticationResult(CryptoObject arg1) {
            super();
            this.mCryptoObject = arg1;
        }

        public CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    public class CryptoObject {
        private final Cipher mCipher;
        private final Mac mMac;
        private final Signature mSignature;

        public CryptoObject(@NonNull Cipher arg1) {
            super();
            this.mCipher = arg1;
            this.mSignature = null;
            this.mMac = null;
        }

        public CryptoObject(@NonNull Signature arg1) {
            super();
            this.mSignature = arg1;
            this.mCipher = null;
            this.mMac = null;
        }

        public CryptoObject(@NonNull Mac arg1) {
            super();
            this.mMac = arg1;
            this.mCipher = null;
            this.mSignature = null;
        }

        @Nullable public Cipher getCipher() {
            return this.mCipher;
        }

        @Nullable public Mac getMac() {
            return this.mMac;
        }

        @Nullable public Signature getSignature() {
            return this.mSignature;
        }
    }

    private final Context mContext;

    private FingerprintManagerCompat(Context arg1) {
        super();
        this.mContext = arg1;
    }

    @RequiresPermission(value="android.permission.USE_FINGERPRINT") public void authenticate(@Nullable CryptoObject arg8, int arg9, @Nullable CancellationSignal arg10, @NonNull AuthenticationCallback arg11, @Nullable Handler arg12) {
        if(Build$VERSION.SDK_INT >= 23) {
            FingerprintManager v1 = FingerprintManagerCompat.getFingerprintManagerOrNull(this.mContext);
            if(v1 != null) {
                Object v10 = arg10 != null ? arg10.getCancellationSignalObject() : null;
                Object v3 = v10;
                v1.authenticate(FingerprintManagerCompat.wrapCryptoObject(arg8), ((android.os.CancellationSignal)v3), arg9, FingerprintManagerCompat.wrapCallback(arg11), arg12);
            }
        }
    }

    @NonNull public static FingerprintManagerCompat from(@NonNull Context arg1) {
        return new FingerprintManagerCompat(arg1);
    }

    @Nullable @RequiresApi(value=23) private static FingerprintManager getFingerprintManagerOrNull(@NonNull Context arg2) {
        if(arg2.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return arg2.getSystemService(FingerprintManager.class);
        }

        return null;
    }

    @RequiresPermission(value="android.permission.USE_FINGERPRINT") public boolean hasEnrolledFingerprints() {
        boolean v1 = false;
        if(Build$VERSION.SDK_INT >= 23) {
            FingerprintManager v0 = FingerprintManagerCompat.getFingerprintManagerOrNull(this.mContext);
            if(v0 != null && (v0.hasEnrolledFingerprints())) {
                v1 = true;
            }

            return v1;
        }

        return 0;
    }

    @RequiresPermission(value="android.permission.USE_FINGERPRINT") public boolean isHardwareDetected() {
        boolean v1 = false;
        if(Build$VERSION.SDK_INT >= 23) {
            FingerprintManager v0 = FingerprintManagerCompat.getFingerprintManagerOrNull(this.mContext);
            if(v0 != null && (v0.isHardwareDetected())) {
                v1 = true;
            }

            return v1;
        }

        return 0;
    }

    @RequiresApi(value=23) static CryptoObject unwrapCryptoObject(FingerprintManager$CryptoObject arg2) {
        CryptoObject v0 = null;
        if(arg2 == null) {
            return v0;
        }

        if(arg2.getCipher() != null) {
            return new CryptoObject(arg2.getCipher());
        }

        if(arg2.getSignature() != null) {
            return new CryptoObject(arg2.getSignature());
        }

        if(arg2.getMac() != null) {
            return new CryptoObject(arg2.getMac());
        }

        return v0;
    }

    @RequiresApi(value=23) private static FingerprintManager$AuthenticationCallback wrapCallback(AuthenticationCallback arg1) {
        return new FingerprintManager$AuthenticationCallback(arg1) {
            public void onAuthenticationError(int arg2, CharSequence arg3) {
                this.val$callback.onAuthenticationError(arg2, arg3);
            }

            public void onAuthenticationFailed() {
                this.val$callback.onAuthenticationFailed();
            }

            public void onAuthenticationHelp(int arg2, CharSequence arg3) {
                this.val$callback.onAuthenticationHelp(arg2, arg3);
            }

            public void onAuthenticationSucceeded(FingerprintManager$AuthenticationResult arg3) {
                this.val$callback.onAuthenticationSucceeded(new AuthenticationResult(FingerprintManagerCompat.unwrapCryptoObject(arg3.getCryptoObject())));
            }
        };
    }

    @RequiresApi(value=23) private static FingerprintManager$CryptoObject wrapCryptoObject(CryptoObject arg2) {
        FingerprintManager$CryptoObject v0 = null;
        if(arg2 == null) {
            return v0;
        }

        if(arg2.getCipher() != null) {
            return new FingerprintManager$CryptoObject(arg2.getCipher());
        }

        if(arg2.getSignature() != null) {
            return new FingerprintManager$CryptoObject(arg2.getSignature());
        }

        if(arg2.getMac() != null) {
            return new FingerprintManager$CryptoObject(arg2.getMac());
        }

        return v0;
    }
}

