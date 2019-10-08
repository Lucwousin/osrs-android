package com.google.android.gms.internal.auth;

import android.util.Log;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

public abstract class zzaz extends FastSafeParcelableJsonResponse {
    private static String zzem = "AUTH";

    static {
    }

    public zzaz() {
        super();
    }

    public byte[] toByteArray() {
        try {
            return this.toString().getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException v0) {
            Log.e(zzaz.zzem, "Error serializing object.", ((Throwable)v0));
            return null;
        }
    }
}

