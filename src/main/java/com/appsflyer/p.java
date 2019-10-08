package com.appsflyer;

import java.security.MessageDigest;
import java.util.Formatter;

final class p {
    p() {
        super();
    }

    public static String ˊ(String arg4) {
        String v0_2;
        try {
            MessageDigest v0_1 = MessageDigest.getInstance("SHA-1");
            v0_1.reset();
            v0_1.update(arg4.getBytes("UTF-8"));
            v0_2 = p.ˎ(v0_1.digest());
        }
        catch(Exception v0) {
            StringBuilder v1 = new StringBuilder("Error turning ");
            v1.append(arg4.substring(0, 6));
            v1.append(".. to SHA1");
            AFLogger.afErrorLog(v1.toString(), ((Throwable)v0));
            v0_2 = null;
        }

        return v0_2;
    }

    private static String ˎ(byte[] arg7) {
        Formatter v0 = new Formatter();
        int v1 = arg7.length;
        int v3;
        for(v3 = 0; v3 < v1; ++v3) {
            v0.format("%02x", Byte.valueOf(arg7[v3]));
        }

        String v7 = v0.toString();
        v0.close();
        return v7;
    }

    public static String ˏ(String arg7) {
        String v1_3;
        try {
            MessageDigest v1_1 = MessageDigest.getInstance("SHA-256");
            v1_1.update(arg7.getBytes());
            byte[] v1_2 = v1_1.digest();
            StringBuffer v2 = new StringBuffer();
            int v3 = v1_2.length;
            int v4;
            for(v4 = 0; v4 < v3; ++v4) {
                v2.append(Integer.toString((v1_2[v4] & 0xFF) + 0x100, 16).substring(1));
            }

            v1_3 = v2.toString();
        }
        catch(Exception v1) {
            StringBuilder v2_1 = new StringBuilder("Error turning ");
            v2_1.append(arg7.substring(0, 6));
            v2_1.append(".. to SHA-256");
            AFLogger.afErrorLog(v2_1.toString(), ((Throwable)v1));
            v1_3 = null;
        }

        return v1_3;
    }

    public static String ॱ(String arg4) {
        String v0_2;
        try {
            MessageDigest v0_1 = MessageDigest.getInstance("MD5");
            v0_1.reset();
            v0_1.update(arg4.getBytes("UTF-8"));
            v0_2 = p.ˎ(v0_1.digest());
        }
        catch(Exception v0) {
            StringBuilder v1 = new StringBuilder("Error turning ");
            v1.append(arg4.substring(0, 6));
            v1.append(".. to MD5");
            AFLogger.afErrorLog(v1.toString(), ((Throwable)v0));
            v0_2 = null;
        }

        return v0_2;
    }
}

