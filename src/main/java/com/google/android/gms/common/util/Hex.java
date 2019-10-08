package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@KeepForSdk @ShowFirstParty public class Hex {
    private static final char[] zzgw;
    private static final char[] zzgx;

    static {
        Hex.zzgw = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Hex.zzgx = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public Hex() {
        super();
    }

    @KeepForSdk public static String bytesToStringUppercase(byte[] arg1) {
        return Hex.bytesToStringUppercase(arg1, false);
    }

    @KeepForSdk public static String bytesToStringUppercase(byte[] arg5, boolean arg6) {
        int v0 = arg5.length;
        StringBuilder v1 = new StringBuilder(v0 << 1);
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if((arg6) && v2 == v0 - 1 && (arg5[v2] & 0xFF) == 0) {
                break;
            }

            v1.append(Hex.zzgw[(arg5[v2] & 0xF0) >>> 4]);
            v1.append(Hex.zzgw[arg5[v2] & 15]);
        }

        return v1.toString();
    }

    @KeepForSdk public static byte[] stringToBytes(String arg6) throws IllegalArgumentException {
        int v0 = arg6.length();
        if(v0 % 2 == 0) {
            byte[] v1 = new byte[v0 / 2];
            int v2;
            for(v2 = 0; v2 < v0; v2 = v4) {
                int v4 = v2 + 2;
                v1[v2 / 2] = ((byte)Integer.parseInt(arg6.substring(v2, v4), 16));
            }

            return v1;
        }

        throw new IllegalArgumentException("Hex string has odd number of characters");
    }

    public static String zza(byte[] arg7) {
        char[] v0 = new char[arg7.length << 1];
        int v1 = 0;
        int v2 = 0;
        while(v1 < arg7.length) {
            int v3 = arg7[v1] & 0xFF;
            int v4 = v2 + 1;
            v0[v2] = Hex.zzgx[v3 >>> 4];
            v2 = v4 + 1;
            v0[v4] = Hex.zzgx[v3 & 15];
            ++v1;
        }

        return new String(v0);
    }
}

