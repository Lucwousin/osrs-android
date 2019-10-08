package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class a {
    final class e extends HashMap {
        final class b {
            private String ˋ;
            private final Object ˎ;
            private long ॱ;

            b(long arg3, String arg5) {
                super();
                this.ˎ = new Object();
                this.ॱ = 0;
                this.ˋ = "";
                this.ॱ = arg3;
                this.ˋ = arg5;
            }

            b() {
                super();
            }

            b(String arg3) {
                this(System.currentTimeMillis(), arg3);
            }

            public final String toString() {
                return this.ॱ + "," + this.ˋ;
            }

            final String ˋ() {
                return this.ˋ;
            }

            private boolean ˎ(long arg8, String arg10) {
                Object v0 = this.ˎ;
                __monitor_enter(v0);
                if(arg10 != null) {
                    try {
                        if(!arg10.equals(this.ˋ)) {
                            int v2 = arg8 - this.ॱ > 2000 ? 1 : 0;
                            if(v2 == 0) {
                                goto label_24;
                            }

                            this.ॱ = arg8;
                            this.ˋ = arg10;
                            __monitor_exit(v0);
                            return 1;
                        }
                    }
                    catch(Throwable v8) {
                        __monitor_exit(v0);
                        throw v8;
                    }
                }

            label_24:
                __monitor_exit(v0);
                return 0;
            }

            @NonNull static b ˏ(String arg4) {
                long v0 = 0;
                if(arg4 == null) {
                    return new b(v0, "");
                }

                String[] v4 = arg4.split(",");
                if(v4.length < 2) {
                    return new b(v0, "");
                }

                return new b(Long.parseLong(v4[0]), v4[1]);
            }

            final boolean ॱ(b arg3) {
                return this.ˎ(arg3.ॱ, arg3.ˋ);
            }

            @NonNull static String ॱ(String arg6) throws Exception {
                byte[] v6 = arg6.getBytes();
                int v0 = 0;
                int v1;
                for(v1 = 0; v1 < v6.length; ++v1) {
                    v6[v1] = ((byte)(v6[v1] ^ v1 % 2 + 42));
                }

                StringBuilder v1_1 = new StringBuilder();
                int v2 = v6.length;
                while(v0 < v2) {
                    String v3 = Integer.toHexString(v6[v0]);
                    if(v3.length() == 1) {
                        v3 = "0".concat(String.valueOf(v3));
                    }

                    v1_1.append(v3);
                    ++v0;
                }

                return v1_1.toString();
            }
        }

        private final Context ˊ;
        private final Map ˋ;
        private static int ˎ = 0;
        private static long ˏ = 0;
        private static char[] ॱ = null;
        private static int ॱॱ = 1;

        static {
            e.ॱ = new char[]{'a', '楟', '툭', '㯟', '꒍', '๰', '眳', '', '䦼', '덠', '᱗', '蔃', '䛱', '⿘', '钀', '絖', '', '彰', '㙈', '贓', '擗', 'ﮈ', '兢', '⠦', '뿵', 'k', '楜', '툔', '茤', '', '兙', '뢅', '⟃', '贻', '', '措', '쫯', '〭', '鼝', 'ك', '涏', '퓓', '䈵', 'ꥻ', 'Ⴕ', '羫', '', '䰜', '뭐', '⋏', '觏', '', '幣', '엳', '⳿', '騨', 'Ċ', '桟', 'ퟌ', '㻀', 'ꐚ', '፸', '窵', '', '伲', '똖', 'ᵛ', '蒃', '', '奃', 'k', '楜', '툔', '㮒', 'ꓝ', 'ฤ', '睯', 'f', '楐', '툀', '㯘', '꒐', '๑', '眷', '', '䦦', '덢', '᱒', '蔷', '', '垑', '셻', '4', '椗', '퉋', '㮅', 'ꓔ', '-', '楋', '툑', '㮅', '꓎', 'f', '楘', '툛', '㯇', 'ꒁ', '๹', '睶', '', '䦭', '덯', 'ᱟ', '蔁', '', '垑', '셷', '⨹', '鏷', 'ﳩ', '晩', '콞', '㠒', 'ꆍ', 'ઐ', '瑾', '\uDD34', '䛤', '꾯', 'ᤣ', '艋', '', '哚', '붏', '✀', '逼', '離', '抨', '챡', '㕍', '鸂', '߆', '炇', '\uDA4F', '䍠', '겳', 'b', '楘', '툐', '㯎', 'ꒅ', '๸', '睦', '', '䧼', '댱', 'ᱞ', '蕊', '', '垃', '섬', '⩧', '鎡', 'ﳱ', '⤡', '䀗', 'ﭖ', 'ኙ', '跋', '✴', '干', '짡', '惡', '騯', '㔎', '걖', '잂', '绑', '', 'Ͷ', '몳', '헽', '伫', '', 'ᅚ', '裃', '⏤', '崞', '', '澅', '蛏', '】', 'ꬥ', '쉪', '維', '铯', 'ม', '륗', '킕', '䯎', '', 't', '楜', '툟', '㯛', 'ꒁ', '๯', '眷', '', '䦽', '덳', 'ᱟ', 'x', '椁', '퉄', '臥', '', '厊', '멎', '┝', '迹', '⧅', '&', '楁', 'ᱮ', '甂', '&', '楉', '䉻', '⬔', '逞', '禆', '', '䰱', '㔻', 'ꊣ', '஥', '', '帕', '윍', '곙', 'ᖌ', '荢', '栧'};
            e.ˏ = -7481529154018449095L;
        }

        e(Map arg1, Context arg2) {
            super();
            this.ˋ = arg1;
            this.ˊ = arg2;
            ((AbstractMap)this).put(this.ˋ(), this.ˊ());
        }

        private String ˊ() {
            int v9;
            int v6_2;
            String v5_1;
            String v0 = "";
            int v1 = 16;
            int v2 = 44;
            int v3 = 102;
            try {
                v5_1 = this.ˋ.get(e.ॱ(0, 12, '\u0000').intern()).toString();
                String v6 = this.ˋ.get(e.ॱ(77, 15, '\u0000').intern()).toString();
                String v7 = e.ॱ(92, 5, '\u0000').intern().replaceAll(e.ॱ(97, 5, '\u0000').intern(), "");
                StringBuilder v8 = new StringBuilder();
                v8.append(v5_1);
                v8.append(v6);
                v8.append(v7);
                v5_1 = p.ˏ(v8.toString());
                v5_1 = v0 + v5_1.substring(0, v1);
            }
            catch(Exception v5) {
                AFLogger.afRDLog(e.ॱ(v3, v2, '\u0000').intern() + v5);
                v5_1 = v0 + e.ॱ(0x92, 18, '\u0000').intern();
            }

            try {
                Intent v0_2 = this.ˊ.registerReceiver(null, new IntentFilter(e.ॱ(0xA4, 37, '⥀').intern()));
                v6_2 = -2700;
                if(v0_2 != null) {
                    v6_2 = v0_2.getIntExtra(e.ॱ(201, 11, '\u0000').intern(), v6_2);
                }

                if(this.ˊ.getApplicationInfo().nativeLibraryDir.contains(e.ॱ(0xD4, 3, '\u0000').intern())) {
                }
                else {
                    goto label_88;
                }
            }
            catch(Exception v0_1) {
                goto label_156;
            }

            int v0_3 = 1;
            goto label_89;
        label_88:
            v0_3 = 0;
        label_89:
            int v8_1 = 2;
            if(v0_3 != 1) {
                e.ˎ = (e.ॱॱ + 53) % 0x80;
                goto label_96;
            }
            else {
                v0_3 = e.ॱॱ + 75;
                e.ˎ = v0_3 % 0x80;
                v9 = 78;
                v0_3 = v0_3 % v8_1 != 0 ? 78 : 29;
                if(v0_3 != v9) {
                    v0_3 = 1;
                    goto label_110;
                }

            label_96:
                v0_3 = 0;
            }

            try {
            label_110:
                v9 = this.ˊ.getSystemService(e.ॱ(0xD7, 6, '膖').intern()).getSensorList(-1).size();
                v0 = e.ॱ(0xDD, 1, '⦧').intern() + v6_2 + e.ॱ(0xDE, v8_1, '\u0000').intern() + v0_3 + e.ॱ(0xE0, v8_1, '᱈').intern() + v9 + e.ॱ(0xE2, v8_1, '\u0000').intern() + this.ˋ.size();
                v0 = v5_1 + b.ॱ(v0);
            }
            catch(Exception v0_1) {
            label_156:
                AFLogger.afRDLog(e.ॱ(v3, v2, '\u0000').intern() + v0_1);
                v0 = v5_1 + e.ॱ(0xE4, v1, '䈝').intern();
            }

            return v0;
        }

        @NonNull private String ˋ() {
            StringBuilder v2_1;
            int v3_1;
            char v6_1;
            int v4_1;
            int v5;
            String v4;
            String v3;
            String v2;
            e.ˎ = (e.ॱॱ + 89) % 0x80;
            int v1 = 2;
            try {
                v2 = Integer.toString(Build$VERSION.SDK_INT);
                v3 = this.ˋ.get(e.ॱ(0, 12, '\u0000').intern()).toString();
                v4 = this.ˋ.get(e.ॱ(12, 5, '䚓').intern()).toString();
                v5 = 21;
                if(v4 == null) {
                }
                else {
                    goto label_26;
                }
            }
            catch(Exception v1_1) {
                goto label_86;
            }

            int v6 = 54;
            goto label_27;
        label_26:
            v6 = 21;
        label_27:
            if(v6 != v5) {
                v5 = 17;
                v4_1 = e.ˎ + v5;
                e.ॱॱ = v4_1 % 0x80;
                v4_1 = v4_1 % v1 == 0 ? 1 : 0;
                v6_1 = '弾';
                if(v4_1 != 1) {
                    v4_1 = 8;
                    try {
                        v4 = e.ॱ(v5, v4_1, v6_1);
                        goto label_43;
                    label_45:
                        v4 = e.ॱ(40, 36, v6_1);
                    label_43:
                        v4 = v4.intern();
                    label_49:
                        StringBuilder v5_1 = new StringBuilder(v3);
                        v5_1.reverse();
                        v3_1 = 3;
                        String[] v6_2 = new String[v3_1];
                        v6_2[0] = v2;
                        v6_2[1] = v4;
                        v6_2[v1] = v5_1.toString();
                        v2_1 = e.ˋ(v6_2);
                        v4_1 = v2_1.length();
                        v5 = 4;
                        v6 = v4_1 > v5 ? 0 : 1;
                        if(v6 != 1) {
                            v2_1.delete(v5, v4_1);
                        }
                        else {
                            goto label_68;
                        }

                        goto label_78;
                    }
                    catch(Exception v1_1) {
                        goto label_86;
                    }
                }
                else {
                    goto label_45;
                }

                goto label_43;
            }

            goto label_49;
            while(true) {
            label_68:
                if(v4_1 < v5) {
                    e.ˎ = (e.ॱॱ + 13) % 0x80;
                    ++v4_1;
                    v6_1 = '1';
                    try {
                        v2_1.append(v6_1);
                        continue;
                    label_78:
                        v2_1.insert(0, e.ॱ(25, v3_1, '\u0000').intern());
                        return v2_1.toString();
                    }
                    catch(Exception v1_1) {
                    label_86:
                        AFLogger.afRDLog(e.ॱ(28, 42, '荂').intern() + v1_1);
                        return e.ॱ(70, 7, '\u0000').intern();
                    }
                }

                goto label_78;
            }
        }

        private static StringBuilder ˋ(@NonNull String[] arg10) throws Exception {
            int v5;
            int v3;
            ArrayList v0 = new ArrayList();
            int v2;
            for(v2 = 0; true; ++v2) {
                v3 = 94;
                int v4 = 3;
                v5 = v2 < v4 ? 18 : 94;
                if(v5 == v3) {
                    break;
                }

                ((List)v0).add(Integer.valueOf(arg10[v2].length()));
            }

            Collections.sort(((List)v0));
            int v0_1 = ((List)v0).get(0).intValue();
            StringBuilder v2_1 = new StringBuilder();
            e.ॱॱ = (e.ˎ + 15) % 0x80;
            v3 = 0;
            while(true) {
                v5 = 69;
                int v6 = v3 < v0_1 ? 69 : 57;
                if(v6 != v5) {
                    return v2_1;
                }

                Object v5_1 = null;
                Integer v7 = ((Integer)v5_1);
                for(v6 = 0; v6 < v4; ++v6) {
                    int v8 = arg10[v6].charAt(v3);
                    if(v7 == null) {
                        int v7_1 = e.ॱॱ + 15;
                        e.ˎ = v7_1 % 0x80;
                        if(v7_1 % 2 != 0) {
                            super.hashCode();
                        }
                    }
                    else {
                        v8 ^= ((Number)v7).intValue();
                    }

                    v7 = Integer.valueOf(v8);
                }

                v2_1.append(Integer.toHexString(((Number)v7).intValue()));
                ++v3;
                e.ˎ = (e.ॱॱ + 67) % 0x80;
            }
        }

        private static String ॱ(int arg8, int arg9, char arg10) {
            char[] v0 = new char[arg9];
            int v1 = 0;
            e.ॱॱ = (e.ˎ + 0x5F) % 0x80;
            while(true) {
                int v2 = 11;
                int v3 = v1 < arg9 ? 50 : 11;
                if(v3 == v2) {
                    break;
                }

                e.ˎ = (e.ॱॱ + 0x5F) % 0x80;
                v0[v1] = ((char)(((int)((((long)e.ॱ[arg8 + v1])) ^ (((long)v1)) * e.ˏ ^ (((long)arg10))))));
                ++v1;
            }

            return new String(v0);
        }
    }

    private static long ˊ = 0;
    private static int ˋ = 1;
    private static int ˎ;
    private static char[] ˏ;

    static {
        a.ˏ = new char[]{'ᝉ', '뙳', '唦', '', '鎓', 'ㅈ', '큲', '罵', 'Ỵ', '붐', '孖', '見', '餤', '㣱', '잡', '敝', 'Ё', 'ꎃ', '䋆', '', '轠', '⸔', '췖', '沃', 'ி', 'ꥫ', '䠳', '៲', '뚅', '呇', '', '鈤', '㇭', '킏', '1', '헋', 'y', 'ꅌ', '䈓', '', '蓹', '♄', '읳', '桞', 'ৌ', 'ꪹ', '䱍', '', '踴', '⿜', '킋', '牨', 'ጣ', '듟', 'b', 'ꅔ', '䈈', '', '蒵', '♬', '윎', '框', '঑', 'ꪹ', '䰧', '', '踝', '⿓', '탟', '爨', '፤', '듣', '喎', '', '預', '㤼', '\uDABA', '篳', '\u1C9C', '블', '当', 'ñ', 'ꇾ', '䌱', '', '蕚', '⭵', '詏', '椚', '죹', '꾯', '൴', '', '䍉', '⋓', '膺', '木', '옑', 'ꔉ', 'ӑ', 'ﮆ', '奪', '㠶', '鿨', '绣', '\uDD9A', '덞', 'ሬ', '', '傲', '㞞', '\uDB1D', '稧', '饲', '㢑', '忇', 'ﴜ', 'ᰦ', '댡', '튼', '燀', '霜', '㙟', '啷', '', '௨', '꤂', '젂', '澪', '躣', 'ⷽ', '䌫', '', 'ƀ', '뤴', '᠎', 'ﭛ', '媸', '㷮', '鼵', '縏', '턈', '낒', 'ᏻ', '', '呓', '㝚', '隝', '槝', '쬭', '꩑', 'න', '', '俑', 'a', 'ꅛ', '䈎', '', '蒻', '♠', '읚', '桝', '৆', 'ꪸ', '䱦', '', '踩', '⿃', '킏', '.', '\\', 'ꄛ', '', '囿', '떷', 'ᑕ', '獑', '퇋', 'ヺ', '鿶', 'ﹷ', '崛', '믉', '᪈', '禾', '\uD868', '/', 'ꅖ', '䈋', '', '蒼', '♬', '.', 'ꄟ', '䉅', '', '蒧', '☣', '윖', '桝', 'ং', 'ꫴ', 'C', 'ꅝ', '䈏', '', '蒿', '♺', '읋', '栞', '৭', 'ꪥ', '䱱', '', '踌', '⿅', '킏', '牴', 'ጾ', 'F', 'ꅔ', '䈃', '', '蒱', '♭', '윞', '标', 'ে', '꫽', '䱵', '', '踈', '⾑', '킅', '牺', 'ጳ', '듭', '嗟', '', '顔', '㤸', '\uDAFA', '箫', '᳘', '빚', '弋', 'ã', 'ꆤ', '䌡', '', '蔓', '⛃', '잰', '楺', 'ੋ', '꬝', '䳆', '', '輩', 'と', 'ᅵ', '끂', '匌', '', '閨', '㝨', '환', '礀', 'ᣖ', '뮣', '嵥', 'ﰱ', '鼯', '㻓', '솄', '捥', 'ȫ', 'ꗴ', '䓉', '', '襟', '⠤', '쯲', '檢', 'C', 'ꅝ', '䈏', '', '蒿', '♺', '읋', '栞', '৺', 'ꪸ', '䱴', '', '踙', '⿒', '킒', '牞', 'ጨ', '듦', '嗟', '', '顐', '㤰', '\uDAE1', '箭', 'F', 'ꅔ', '䈃', '', '蒱', '♭', '윞', '栚', '৆', 'ꪫ', '䱽', '', '踙', '⾑', '킔', '牾', 'ጶ', '듩', '嗟', '', '顐', '㤼', '\uDAEA', '篣', '\u1C95', '빈', '弖', 'ÿ', 'ꆣ', '䍥', '', '蔜', '⛉', '잡', '楢', 'ਟ', 'ꬑ', '䳑', '', '轶', '〸', '턉', '狛', 'ᎈ', '땲', '噫', ''};
        a.ˊ = 0x36D1DF332518A135L;
    }

    a() {
        super();
    }

    private static String ˊ(Context arg10, String arg11) {
        String v2_1;
        s v11;
        PackageManager v10 = arg10.getPackageManager();
        int v0 = 0x2F;
        int v1 = 308;
        int v2 = 284;
        int v3 = 24;
        try {
            Iterator v10_4 = PackageManager.class.getDeclaredMethod(a.ॱ(260, v3, 'ᄒ').intern(), Integer.TYPE).invoke(v10, Integer.valueOf(0)).iterator();
            while(true) {
            label_21:
                if(v10_4.hasNext()) {
                    break;
                }
                else {
                    goto label_25;
                }
            }
        }
        catch(InvocationTargetException v10_1) {
            goto label_51;
        }
        catch(IllegalAccessException v10_2) {
            goto label_77;
        }
        catch(NoSuchMethodException v10_3) {
            goto label_64;
        }

        int v5 = 1;
        goto label_26;
    label_25:
        v5 = 0;
    label_26:
        if(v5 != 1) {
            goto label_88;
        }

        a.ˋ = (a.ˎ + 93) % 0x80;
        try {
            if(v10_4.next().packageName.equals(arg11)) {
            }
            else {
                goto label_39;
            }
        }
        catch(InvocationTargetException v10_1) {
            goto label_51;
        }
        catch(IllegalAccessException v10_2) {
            goto label_77;
        }
        catch(NoSuchMethodException v10_3) {
            goto label_64;
        }

        v5 = 1;
        goto label_40;
    label_39:
        v5 = 0;
    label_40:
        if(v5 != 1) {
            goto label_21;
        }

        a.ˎ = (a.ˋ + 85) % 0x80;
        try {
            return Boolean.TRUE.toString();
        }
        catch(InvocationTargetException v10_1) {
        label_51:
            v11 = s.ˏ();
            v2_1 = a.ॱ(v2, v3, '\u0000').intern();
            v11.ˋ(v2_1, a.ॱ(v1, v0, '\u0000').intern() + v10_1);
        }
        catch(NoSuchMethodException v10_3) {
        label_64:
            v11 = s.ˏ();
            v2_1 = a.ॱ(v2, v3, '\u0000').intern();
            v11.ˋ(v2_1, a.ॱ(v1, v0, '\u0000').intern() + v10_3);
        }
        catch(IllegalAccessException v10_2) {
        label_77:
            v11 = s.ˏ();
            v2_1 = a.ॱ(v2, v3, '\u0000').intern();
            v11.ˋ(v2_1, a.ॱ(v1, v0, '\u0000').intern() + v10_2);
        }

    label_88:
        return Boolean.FALSE.toString();
    }

    private static String ˎ(String arg9) {
        int v0 = a.ˎ + 9;
        a.ˋ = v0 % 0x80;
        int v1 = 2;
        int v2 = 0xA9;
        if(v0 % v1 != 0) {
            int v5 = 35;
            v0 = !arg9.contains(a.ॱ(v2, 1, '\u0000').intern()) ? 35 : 74;
            if(v0 == v5) {
                return arg9;
            }

        label_25:
            String[] v9 = arg9.split(a.ॱ(170, v1, '\u0000').intern());
            v0 = v9.length;
            StringBuilder v5_1 = new StringBuilder();
            --v0;
            v5_1.append(v9[v0]);
            v5_1.append(a.ॱ(v2, 1, '\u0000').intern());
            int v6;
            for(v6 = 1; true; ++v6) {
                int v7 = 0x5F;
                int v8 = v6 < v0 ? 44 : 0x5F;
                if(v8 == v7) {
                    break;
                }

                a.ˎ = (a.ˋ + 87) % 0x80;
                v5_1.append(v9[v6]);
                v5_1.append(a.ॱ(v2, 1, '\u0000').intern());
            }

            v5_1.append(v9[0]);
            return v5_1.toString();
        }
        else if(!arg9.contains(a.ॱ(0x2280, 1, '\u0000').intern())) {
        }
        else {
            goto label_25;
        }

        return arg9;
    }

    private static String ˏ(Context arg3) {
        String v3;
        int v0 = a.ˎ + 37;
        a.ˋ = v0 % 0x80;
        int v1 = 29;
        v0 = v0 % 2 == 0 ? 0 : 29;
        if(v0 != v1) {
            try {
                PackageManager v0_1 = arg3.getPackageManager();
                v3 = arg3.getPackageName();
                goto label_14;
            label_17:
                v0_1 = arg3.getPackageManager();
                v3 = arg3.getPackageName();
            label_14:
                v3 = v0_1.getPackageInfo(v3, 0).packageName;
                goto label_20;
            }
            catch(PackageManager$NameNotFoundException ) {
                return null;
            }
        }
        else {
            goto label_17;
        }

        goto label_14;
    label_20:
        v0 = a.ˋ + 77;
        a.ˎ = v0 % 0x80;
        v1 = 45;
        v0 = v0 % 2 != 0 ? 45 : 88;
        if(v0 != v1) {
            return v3;
        }

        return v3;
    }

    @Nullable static String ˏ(Context arg12, long arg13) {
        String v12_1;
        StringBuilder v0 = new StringBuilder();
        StringBuilder v1 = new StringBuilder();
        StringBuilder v2 = new StringBuilder();
        int v4 = 34;
        char v6 = '헻';
        int v7 = 35;
        String v3 = a.ॱ(a.ॱ(0, v4, 'ᜨ').intern()) ? a.ॱ(v4, 1, '\u0000') : a.ॱ(v7, 1, v6);
        v3 = v3.intern();
        v1.append(v3);
        StringBuilder v3_1 = new StringBuilder();
        String v9 = arg12.getPackageName();
        String v10 = a.ˎ(v9);
        v1.append(a.ॱ(v4, 1, '\u0000').intern());
        v3_1.append(v10);
        if(a.ॱ(arg12) == null) {
            v1.append(a.ॱ(v7, 1, v6).intern());
            v3_1.append(v9);
        }
        else {
            v1.append(a.ॱ(v4, 1, '\u0000').intern());
            v3_1.append(v9);
        }

        v10 = a.ˏ(arg12);
        if(v10 == null) {
            v1.append(a.ॱ(v7, 1, v6).intern());
            v3_1.append(v9);
        }
        else {
            v1.append(a.ॱ(v4, 1, '\u0000').intern());
            v3_1.append(v10);
        }

        v3_1.append(a.ˊ(arg12, v9));
        v0.append(v3_1.toString());
        try {
            long v9_1 = arg12.getPackageManager().getPackageInfo(arg12.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat v3_2 = new SimpleDateFormat(a.ॱ(36, 18, '\u0000').intern(), Locale.US);
            ((DateFormat)v3_2).setTimeZone(TimeZone.getTimeZone("UTC"));
            v0.append(((DateFormat)v3_2).format(new Date(v9_1)));
        }
        catch(PackageManager$NameNotFoundException ) {
            return a.ॱ(54, 0x20, '\u0000').intern();
        }

        int v12 = a.ˋ + 61;
        a.ˎ = v12 % 0x80;
        int v3_3 = 2;
        int v9_2 = 85;
        v12 = v12 % v3_3 != 0 ? 13 : 85;
        char v10_1 = '⬔';
        int v11 = 87;
        if(v12 != v9_2) {
            v0.append(arg13);
            v9_2 = 69;
            v12 = a.ॱ(a.ॱ(v11, 65, v10_1).intern()) ? 24 : 69;
            if(v12 == v9_2) {
                goto label_110;
            }

            goto label_107;
        }
        else {
            v0.append(arg13);
            if(a.ॱ(a.ॱ(86, 25, v10_1).intern())) {
            label_107:
                v12_1 = a.ॱ(v4, 1, '\u0000');
                goto label_108;
            }

        label_110:
            v12_1 = a.ॱ(v7, 1, v6);
        }

    label_108:
        v12_1 = v12_1.intern();
        v2.append(v12_1);
        if(a.ॱ(a.ॱ(0x6F, 23, '\uDB7C').intern())) {
            v12_1 = a.ॱ(v4, 1, '\u0000').intern();
        }
        else {
            v12_1 = a.ॱ(v7, 1, v6).intern();
            a.ˎ = (a.ˋ + v11) % 0x80;
        }

        v2.append(v12_1);
        if(a.ॱ(a.ॱ(0x86, 20, '륕').intern())) {
            v12 = a.ˋ + 107;
            a.ˎ = v12 % 0x80;
            if(v12 % v3_3 != 0) {
                v12_1 = a.ॱ(72, 0, '\u0000').intern();
            }
            else {
                v12_1 = a.ॱ(v4, 1, '\u0000');
                goto label_151;
            }
        }
        else {
            v12_1 = a.ॱ(v7, 1, v6);
        label_151:
            v12_1 = v12_1.intern();
        }

        v2.append(v12_1);
        if(a.ॱ(a.ॱ(0x9A, 15, '\u0000').intern())) {
            v12 = a.ˋ + 107;
            a.ˎ = v12 % 0x80;
            int v6_1 = 29;
            if(v12 % v3_3 != 0) {
            }
            else {
                v11 = 29;
            }

            if(v11 != v6_1) {
                v12_1 = a.ॱ(0x7A, 1, '\u0000').intern();
                goto label_177;
            }

            v12_1 = a.ॱ(v4, 1, '\u0000');
            goto label_176;
        }
        else {
            v12_1 = a.ॱ(v7, 1, v6);
        label_176:
            v12_1 = v12_1.intern();
        }

    label_177:
        v2.append(v12_1);
        v12_1 = p.ॱ(p.ˏ(v0.toString()));
        String v0_1 = v1.toString();
        v1 = new StringBuilder(v12_1);
        v1.setCharAt(17, Integer.toString(Integer.parseInt(v0_1, v3_3), 16).charAt(0));
        v12_1 = v1.toString();
        v0_1 = v2.toString();
        v1 = new StringBuilder(v12_1);
        v1.setCharAt(27, Integer.toString(Integer.parseInt(v0_1, v3_3), 16).charAt(0));
        return a.ॱ(v1.toString(), Long.valueOf(arg13));
    }

    private static String ॱ(int arg9, int arg10, char arg11) {
        a.ˋ = (a.ˎ + 103) % 0x80;
        char[] v0 = new char[arg10];
        int v2;
        for(v2 = 0; true; ++v2) {
            int v4 = v2 < arg10 ? 1 : 0;
            if(v4 != 1) {
                return new String(v0);
            }

            a.ˋ = (a.ˎ + 61) % 0x80;
            v0[v2] = ((char)(((int)((((long)a.ˏ[arg9 + v2])) ^ (((long)v2)) * a.ˊ ^ (((long)arg11))))));
        }
    }

    private static boolean ॱ(String arg3) {
        a.ˋ = (a.ˎ + 0x79) % 0x80;
        try {
            Class.forName(arg3);
            return 1;
        }
        catch(ClassNotFoundException ) {
            return 0;
        }
    }

    private static String ॱ(Context arg7) {
        String v7_2;
        Matcher v7_1;
        a.ˎ = (a.ˋ + 23) % 0x80;
        int v0 = System.getProperties().containsKey(a.ॱ(0xAC, 14, '').intern()) ? 0 : 1;
        String v3 = null;
        if(v0 != 1) {
            a.ˎ = (a.ˋ + 89) % 0x80;
            try {
                v7_1 = Pattern.compile(a.ॱ(0xC0, 10, '\u0000').intern()).matcher(arg7.getCacheDir().getPath().replace(a.ॱ(0xBA, 6, '\u0000').intern(), ""));
                if(v7_1.find()) {
                }
                else {
                    goto label_43;
                }
            }
            catch(Exception v7) {
                goto label_57;
            }

            v0 = 0;
            goto label_44;
        label_43:
            v0 = 1;
        label_44:
            if(v0 == 1) {
                return v3;
            }

            v0 = a.ˎ + 15;
            a.ˋ = v0 % 0x80;
            if(v0 % 2 == 0) {
                try {
                    v7_2 = v7_1.group(0);
                    goto label_54;
                label_53:
                    v7_2 = v7_1.group(1);
                }
                catch(Exception v7) {
                label_57:
                    s v0_1 = s.ˏ();
                    String v1 = a.ॱ(202, 17, '\u0000').intern();
                    v0_1.ˋ(v1, a.ॱ(0xDB, 41, '\u0000').intern() + v7);
                    return v3;
                }
            }
            else {
                goto label_53;
            }

        label_54:
            v3 = v7_2;
        }

        return v3;
    }

    private static String ॱ(String arg7, Long arg8) {
        int v7;
        int v0 = 0;
        int v2 = arg7 != null ? 0 : 1;
        int v3 = 0x20;
        if(v2 != 0) {
        }
        else {
            v2 = a.ˎ + 45;
            a.ˋ = v2 % 0x80;
            if(v2 % 2 == 0) {
                v2 = 51;
                int v4 = arg8 != null ? 51 : 60;
                if(v4 == v2) {
                    goto label_25;
                }

                goto label_110;
            }
            else if(arg8 == null) {
                goto label_110;
            }

        label_25:
            if(arg7.length() != v3) {
                goto label_110;
            }

            StringBuilder v2_1 = new StringBuilder(arg7);
            arg7 = arg8.toString();
            long v3_1 = 0;
            int v8 = 0;
            int v5 = 0;
            while(true) {
                int v6 = v8 < arg7.length() ? 0 : 1;
                if(v6 == 1) {
                    break;
                }

                v5 += Character.getNumericValue(arg7.charAt(v8));
                ++v8;
            }

            arg7 = Integer.toHexString(v5);
            v2_1.replace(7, arg7.length() + 7, arg7);
            a.ˋ = (a.ˎ + 77) % 0x80;
            while(true) {
                v8 = 35;
                if(v0 < v2_1.length()) {
                    v7 = a.ˋ + v8;
                    a.ˎ = v7 % 0x80;
                    if(v7 % 2 != 0) {
                        v3_1 -= ((long)Character.getNumericValue(v2_1.charAt(v0)));
                        v0 += 29;
                    }
                    else {
                        v3_1 += ((long)Character.getNumericValue(v2_1.charAt(v0)));
                        ++v0;
                    }

                    continue;
                }

                break;
            }

            while(true) {
                long v5_1 = 100;
                if(v3_1 <= v5_1) {
                    break;
                }

                v7 = a.ˋ + 89;
                a.ˎ = v7 % 0x80;
                if(v7 % 2 != 0) {
                    v3_1 *= v5_1;
                    continue;
                }

                v3_1 %= v5_1;
            }

            v0 = 23;
            v2_1.insert(v0, ((int)v3_1));
            if(v3_1 < 10) {
                v7 = a.ˋ + 15;
                a.ˎ = v7 % 0x80;
                char v3_2 = '헻';
                if(v7 % 2 != 0) {
                    v2_1.insert(101, a.ॱ(36, 1, v3_2).intern());
                }
                else {
                    v2_1.insert(v0, a.ॱ(v8, 1, v3_2).intern());
                }
            }

            return v2_1.toString();
        }

    label_110:
        return a.ॱ(54, v3, '\u0000').intern();
    }
}

