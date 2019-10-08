package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.zzc;

@KeepForSdk public final class Preconditions {
    private Preconditions() {
        super();
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk public static void checkArgument(boolean arg0, Object arg1) {
        if(arg0) {
            return;
        }

        throw new IllegalArgumentException(String.valueOf(arg1));
    }

    @KeepForSdk public static void checkArgument(boolean arg0) {
        if(arg0) {
            return;
        }

        throw new IllegalArgumentException();
    }

    @KeepForSdk public static void checkArgument(boolean arg0, String arg1, Object[] arg2) {
        if(arg0) {
            return;
        }

        throw new IllegalArgumentException(String.format(arg1, arg2));
    }

    @KeepForSdk public static void checkHandlerThread(Handler arg1) {
        if(Looper.myLooper() == arg1.getLooper()) {
            return;
        }

        throw new IllegalStateException("Must be called on the handler thread");
    }

    @KeepForSdk public static void checkMainThread(String arg1) {
        if(zzc.isMainThread()) {
            return;
        }

        throw new IllegalStateException(arg1);
    }

    @KeepForSdk public static String checkNotEmpty(String arg1) {
        if(!TextUtils.isEmpty(((CharSequence)arg1))) {
            return arg1;
        }

        throw new IllegalArgumentException("Given String is empty or null");
    }

    @KeepForSdk public static String checkNotEmpty(String arg1, Object arg2) {
        if(!TextUtils.isEmpty(((CharSequence)arg1))) {
            return arg1;
        }

        throw new IllegalArgumentException(String.valueOf(arg2));
    }

    @KeepForSdk public static void checkNotMainThread(String arg1) {
        if(!zzc.isMainThread()) {
            return;
        }

        throw new IllegalStateException(arg1);
    }

    @KeepForSdk public static void checkNotMainThread() {
        Preconditions.checkNotMainThread("Must not be called on the main application thread");
    }

    @NonNull @KeepForSdk public static Object checkNotNull(@Nullable Object arg1) {
        if(arg1 != null) {
            return arg1;
        }

        throw new NullPointerException("null reference");
    }

    @NonNull @KeepForSdk public static Object checkNotNull(Object arg0, Object arg1) {
        if(arg0 != null) {
            return arg0;
        }

        throw new NullPointerException(String.valueOf(arg1));
    }

    @KeepForSdk public static int checkNotZero(int arg1) {
        if(arg1 != 0) {
            return arg1;
        }

        throw new IllegalArgumentException("Given Integer is zero");
    }

    @KeepForSdk public static int checkNotZero(int arg0, Object arg1) {
        if(arg0 != 0) {
            return arg0;
        }

        throw new IllegalArgumentException(String.valueOf(arg1));
    }

    @KeepForSdk public static long checkNotZero(long arg2) {
        if(arg2 != 0) {
            return arg2;
        }

        throw new IllegalArgumentException("Given Long is zero");
    }

    @KeepForSdk public static long checkNotZero(long arg2, Object arg4) {
        if(arg2 != 0) {
            return arg2;
        }

        throw new IllegalArgumentException(String.valueOf(arg4));
    }

    @KeepForSdk public static void checkState(boolean arg0) {
        if(arg0) {
            return;
        }

        throw new IllegalStateException();
    }

    @KeepForSdk public static void checkState(boolean arg0, Object arg1) {
        if(arg0) {
            return;
        }

        throw new IllegalStateException(String.valueOf(arg1));
    }

    @KeepForSdk public static void checkState(boolean arg0, String arg1, Object[] arg2) {
        if(arg0) {
            return;
        }

        throw new IllegalStateException(String.format(arg1, arg2));
    }
}

