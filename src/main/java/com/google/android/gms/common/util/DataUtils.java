package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap$CompressFormat;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

@KeepForSdk public final class DataUtils {
    public DataUtils() {
        super();
    }

    @KeepForSdk public static void copyStringToBuffer(String arg3, CharArrayBuffer arg4) {
        if(TextUtils.isEmpty(((CharSequence)arg3))) {
            arg4.sizeCopied = 0;
        }
        else {
            if(arg4.data != null) {
                if(arg4.data.length < arg3.length()) {
                }
                else {
                    arg3.getChars(0, arg3.length(), arg4.data, 0);
                    goto label_18;
                }
            }

            arg4.data = arg3.toCharArray();
        }

    label_18:
        arg4.sizeCopied = arg3.length();
    }

    @KeepForSdk public static byte[] loadImageBytes(Bitmap arg3) {
        ByteArrayOutputStream v0 = new ByteArrayOutputStream();
        arg3.compress(Bitmap$CompressFormat.JPEG, 100, ((OutputStream)v0));
        return v0.toByteArray();
    }
}

