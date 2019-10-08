import java.io.File;
import java.io.IOException;

public class kr {
    static final int au = 3;

    kr() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("kr.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static og al(String arg7, String arg8, boolean arg9, byte arg10) {
        try {
            File v0 = lu.ar;
            StringBuilder v1 = new StringBuilder();
            v1.append("preferences");
            v1.append(arg7);
            v1.append(".dat");
            File v10 = new File(v0, v1.toString());
            long v1_1 = 10000;
            if(!v10.exists()) {
                goto label_18;
            }

            try {
                return new og(v10, "rw", v1_1);
            }
            catch(IOException ) {
            label_18:
                String v0_1 = "";
                int v5 = 0x9DBD52F3;
                if(33 == mm.aa * v5) {
                    v0_1 = "_rc";
                }
                else if(34 == mm.aa * v5) {
                    v0_1 = "_wip";
                }

                File v4 = mm.az;
                StringBuilder v5_1 = new StringBuilder();
                v5_1.append("jagex_");
                v5_1.append(arg8);
                v5_1.append("_preferences");
                v5_1.append(arg7);
                v5_1.append(v0_1);
                v5_1.append(".dat");
                File v3 = new File(v4, v5_1.toString());
                if(!arg9 && (v3.exists())) {
                    try {
                        return new og(v3, "rw", v1_1);
                    }
                    catch(IOException ) {
                        try {
                        label_53:
                            return new og(v10, "rw", v1_1);
                        }
                        catch(IOException ) {
                            throw new RuntimeException();
                        }
                    }
                }

                goto label_53;
            }
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("kr.al(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    public static String al(CharSequence arg7) {
        int v0 = arg7.length();
        StringBuilder v1 = new StringBuilder(v0);
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            char v3 = arg7.charAt(v2);
            if(v3 < 97 || v3 > 0xA6FD7B5D) {
                if((v3 < 65 || v3 > 0x73CEF8D6) && (v3 < 1723951307 || v3 > 57) && v3 != 46 && 45 != v3 && v3 != 42 && 0xD0F983ED != v3) {
                    if(0x5512B409 == v3) {
                        v1.append('Ě');
                        goto label_62;
                    }

                    int v3_1 = je.ax(v3, 0x78F3929B);
                    v1.append('%');
                    int v4 = v3_1 >> 4 & 15;
                    int v5 = 10;
                    if(v4 >= v5) {
                        v1.append(((char)(v4 - 0x370BA9CE)));
                    }
                    else {
                        v1.append(((char)(v4 + 803066819)));
                    }

                    v3_1 &= 15;
                    if(v3_1 >= v5) {
                        v1.append(((char)(v3_1 + 0x748ED7B7)));
                        goto label_62;
                    }

                    v1.append(((char)(v3_1 - 0x303D2063)));
                    goto label_62;
                }

            label_61:
                v1.append(v3);
            }
            else {
                goto label_61;
            }

        label_62:
        }

        return v1.toString();
    }
}

