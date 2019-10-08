package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk public final class HexDumpUtils {
    public HexDumpUtils() {
        super();
    }

    @KeepForSdk public static String dump(byte[] arg11, int arg12, int arg13, boolean arg14) {
        if(arg11 != null && arg11.length != 0 && arg12 >= 0 && arg13 > 0) {
            if(arg12 + arg13 > arg11.length) {
            }
            else {
                int v0 = 57;
                if(arg14) {
                    v0 = 75;
                }

                int v3 = 16;
                StringBuilder v1 = new StringBuilder(v0 * ((arg13 + 16 - 1) / v3));
                int v5 = arg12;
                arg12 = arg13;
                int v4 = 0;
                int v6 = 0;
                while(arg12 > 0) {
                    int v7 = 8;
                    if(v4 == 0) {
                        if(arg13 < 0x10000) {
                            v1.append(String.format("%04X:", Integer.valueOf(v5)));
                        }
                        else {
                            v1.append(String.format("%08X:", Integer.valueOf(v5)));
                        }

                        v6 = v5;
                    }
                    else {
                        if(v4 != v7) {
                            goto label_48;
                        }

                        v1.append(" -");
                    }

                label_48:
                    v1.append(String.format(" %02X", Integer.valueOf(arg11[v5] & 0xFF)));
                    --arg12;
                    ++v4;
                    if((arg14) && (v4 == v3 || arg12 == 0)) {
                        int v8 = 16 - v4;
                        if(v8 > 0) {
                            int v9;
                            for(v9 = 0; v9 < v8; ++v9) {
                                v1.append("   ");
                            }
                        }

                        if(v8 >= v7) {
                            v1.append("  ");
                        }

                        v1.append("  ");
                        for(v7 = 0; v7 < v4; ++v7) {
                            char v8_1 = ((char)arg11[v6 + v7]);
                            if(v8_1 < 0x20 || v8_1 > 0x7E) {
                                v8_1 = '.';
                            }
                            else {
                            }

                            v1.append(v8_1);
                        }
                    }

                    if(v4 == v3 || arg12 == 0) {
                        v1.append('\n');
                        v4 = 0;
                    }

                    ++v5;
                }

                return v1.toString();
            }
        }

        return null;
    }
}

