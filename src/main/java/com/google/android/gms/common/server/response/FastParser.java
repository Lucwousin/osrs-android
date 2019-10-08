package com.google.android.gms.common.server.response;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

@KeepForSdk @ShowFirstParty public class FastParser {
    @KeepForSdk @ShowFirstParty public class ParseException extends Exception {
        public ParseException(String arg1) {
            super(arg1);
        }

        public ParseException(String arg1, Throwable arg2) {
            super(arg1, arg2);
        }

        public ParseException(Throwable arg1) {
            super(arg1);
        }
    }

    interface zaa {
        Object zah(FastParser arg1, BufferedReader arg2) throws ParseException, IOException;
    }

    private final char[] zaqa;
    private final char[] zaqb;
    private final char[] zaqc;
    private final StringBuilder zaqd;
    private final StringBuilder zaqe;
    private static final char[] zaqf;
    private static final char[] zaqg;
    private static final char[] zaqh;
    private static final char[] zaqi;
    private static final char[] zaqj;
    private static final char[] zaqk;
    private final Stack zaql;
    private static final zaa zaqm;
    private static final zaa zaqn;
    private static final zaa zaqo;
    private static final zaa zaqp;
    private static final zaa zaqq;
    private static final zaa zaqr;
    private static final zaa zaqs;
    private static final zaa zaqt;

    static {
        FastParser.zaqf = new char[]{'u', 'l', 'l'};
        FastParser.zaqg = new char[]{'r', 'u', 'e'};
        FastParser.zaqh = new char[]{'r', 'u', 'e', '\"'};
        FastParser.zaqi = new char[]{'a', 'l', 's', 'e'};
        FastParser.zaqj = new char[]{'a', 'l', 's', 'e', '\"'};
        FastParser.zaqk = new char[]{'\n'};
        FastParser.zaqm = new com.google.android.gms.common.server.response.zaa();
        FastParser.zaqn = new zab();
        FastParser.zaqo = new zac();
        FastParser.zaqp = new zad();
        FastParser.zaqq = new zae();
        FastParser.zaqr = new zaf();
        FastParser.zaqs = new zag();
        FastParser.zaqt = new zah();
    }

    public FastParser() {
        super();
        this.zaqa = new char[1];
        this.zaqb = new char[0x20];
        this.zaqc = new char[0x400];
        this.zaqd = new StringBuilder(0x20);
        this.zaqe = new StringBuilder(0x400);
        this.zaql = new Stack();
    }

    @KeepForSdk public void parse(InputStream arg5, FastJsonResponse arg6) throws ParseException {
        BufferedReader v0 = new BufferedReader(new InputStreamReader(arg5), 0x400);
        try {
            this.zaql.push(Integer.valueOf(0));
            char v5_2 = this.zaj(v0);
            if(v5_2 == 0) {
                goto label_56;
            }

            if(v5_2 == 91) {
                this.zaql.push(Integer.valueOf(5));
                Map v5_3 = arg6.getFieldMappings();
                if(v5_3.size() == 1) {
                    Object v5_4 = v5_3.entrySet().iterator().next().getValue();
                    arg6.addConcreteTypeArrayInternal(((Field)v5_4), ((Field)v5_4).zapu, this.zaa(v0, ((Field)v5_4)));
                }
                else {
                    goto label_52;
                }
            }
            else if(v5_2 == 0x7B) {
                this.zaql.push(Integer.valueOf(1));
                this.zaa(v0, arg6);
            }
            else {
                StringBuilder v2 = new StringBuilder(19);
                v2.append("Unexpected token: ");
                v2.append(v5_2);
                throw new ParseException(v2.toString());
            }

            this.zak(0);
        }
        catch(Throwable v5) {
            goto label_61;
        }
        catch(IOException v5_1) {
            goto label_63;
        }

        try {
            v0.close();
            return;
        }
        catch(IOException ) {
            Log.w("FastParser", "Failed to close reader while parsing.");
            return;
        }

        try {
        label_52:
            throw new ParseException("Object array response class must have a single Field");
        label_56:
            throw new ParseException("No data to parse");
        }
        catch(Throwable v5) {
        }
        catch(IOException v5_1) {
            try {
            label_63:
                throw new ParseException(((Throwable)v5_1));
            }
            catch(Throwable v5) {
            label_61:
                try {
                    v0.close();
                }
                catch(IOException ) {
                    Log.w("FastParser", "Failed to close reader while parsing.");
                }

                throw v5;
            }
        }
    }

    static int zaa(FastParser arg0, BufferedReader arg1) throws ParseException, IOException {
        return arg0.zad(arg1);
    }

    private final int zaa(BufferedReader arg9, char[] arg10) throws ParseException, IOException {
        int v0_1;
        char v0 = this.zaj(arg9);
        if(v0 != 0) {
            int v1 = 44;
            if(v0 != v1) {
                if(v0 == 110) {
                    this.zab(arg9, FastParser.zaqf);
                    return 0;
                }

                arg9.mark(0x400);
                int v2 = -1;
                int v4 = 34;
                if(v0 == v4) {
                    v0_1 = 0;
                    v1 = 0;
                    while(true) {
                        if(v0_1 < arg10.length && arg9.read(arg10, v0_1, 1) != v2) {
                            char v6 = arg10[v0_1];
                            if(!Character.isISOControl(v6)) {
                                if(v6 == v4 && v1 == 0) {
                                    arg9.reset();
                                    arg9.skip(((long)(v0_1 + 1)));
                                    return v0_1;
                                }

                                if(v6 == 92) {
                                    v1 ^= 1;
                                }
                                else {
                                    v1 = 0;
                                }

                                ++v0_1;
                                continue;
                            }
                            else {
                                break;
                            }
                        }

                        goto label_69;
                    }

                    throw new ParseException("Unexpected control character while reading string");
                }
                else {
                    arg10[0] = v0;
                    v0_1 = 1;
                    while(true) {
                        if(v0_1 >= arg10.length) {
                            goto label_69;
                        }

                        if(arg9.read(arg10, v0_1, 1) == v2) {
                            goto label_69;
                        }

                        if(arg10[v0_1] != 0x7D && arg10[v0_1] != v1 && !Character.isWhitespace(arg10[v0_1])) {
                            if(arg10[v0_1] == 93) {
                            }
                            else {
                                ++v0_1;
                                continue;
                            }
                        }

                        break;
                    }

                    arg9.reset();
                    arg9.skip(((long)(v0_1 - 1)));
                    arg10[v0_1] = '\u0000';
                    return v0_1;
                }

            label_69:
                if(v0_1 == arg10.length) {
                    throw new ParseException("Absurdly long value");
                }

                throw new ParseException("Unexpected EOF");
            }

            throw new ParseException("Missing value");
        }

        throw new ParseException("Unexpected EOF");
    }

    private final String zaa(BufferedReader arg5) throws ParseException, IOException {
        int v1 = 2;
        this.zaql.push(Integer.valueOf(v1));
        char v0 = this.zaj(arg5);
        String v3 = null;
        if(v0 != 34) {
            if(v0 != 93) {
                if(v0 == 0x7D) {
                    this.zak(v1);
                    return v3;
                }

                StringBuilder v2 = new StringBuilder(19);
                v2.append("Unexpected token: ");
                v2.append(v0);
                throw new ParseException(v2.toString());
            }

            this.zak(v1);
            this.zak(1);
            this.zak(5);
            return v3;
        }

        this.zaql.push(Integer.valueOf(3));
        String v0_1 = FastParser.zab(arg5, this.zaqb, this.zaqd, ((char[])v3));
        this.zak(3);
        if(this.zaj(arg5) == 58) {
            return v0_1;
        }

        throw new ParseException("Expected key/value separator");
    }

    private final String zaa(BufferedReader arg3, char[] arg4, StringBuilder arg5, char[] arg6) throws ParseException, IOException {
        int v0 = this.zaj(arg3);
        if(v0 != 34) {
            if(v0 == 110) {
                this.zab(arg3, FastParser.zaqf);
                return null;
            }

            throw new ParseException("Expected string");
        }

        return FastParser.zab(arg3, arg4, arg5, arg6);
    }

    private final ArrayList zaa(BufferedReader arg9, Field arg10) throws ParseException, IOException {
        StringBuilder v10;
        ArrayList v0 = new ArrayList();
        char v1 = this.zaj(arg9);
        int v2 = 93;
        int v3 = 5;
        if(v1 == v2) {
            goto label_69;
        }

        if(v1 == 110) {
            goto label_64;
        }

        int v4 = 19;
        int v5 = 0x7B;
        if(v1 != v5) {
            goto label_55;
        }

        this.zaql.push(Integer.valueOf(1));
        try {
            while(true) {
            label_15:
                FastJsonResponse v1_1 = arg10.zacp();
                if(!this.zaa(arg9, v1_1)) {
                    return v0;
                }

                v0.add(v1_1);
                break;
            }
        }
        catch(IllegalAccessException v9) {
            throw new ParseException("Error instantiating inner object", ((Throwable)v9));
        }
        catch(InstantiationException v9_1) {
            throw new ParseException("Error instantiating inner object", ((Throwable)v9_1));
        }

        v1 = this.zaj(arg9);
        if(v1 != 44) {
            if(v1 == v2) {
                this.zak(v3);
                return v0;
            }

            v10 = new StringBuilder(v4);
            v10.append("Unexpected token: ");
            v10.append(v1);
            throw new ParseException(v10.toString());
        }

        if(this.zaj(arg9) == v5) {
            this.zaql.push(Integer.valueOf(1));
            goto label_15;
        }

        throw new ParseException("Expected start of next object in array");
        return v0;
    label_55:
        v10 = new StringBuilder(v4);
        v10.append("Unexpected token: ");
        v10.append(v1);
        throw new ParseException(v10.toString());
    label_64:
        this.zab(arg9, FastParser.zaqf);
        this.zak(v3);
        return null;
    label_69:
        this.zak(v3);
        return v0;
    }

    private final boolean zaa(BufferedReader arg14, FastJsonResponse arg15) throws ParseException, IOException {
        HashMap v5_3;
        Map v5_2;
        int v5;
        StringBuilder v0_2;
        char v7_2;
        String v0_1;
        String v15_1;
        Object v1_1;
        Map v0 = arg15.getFieldMappings();
        String v1 = this.zaa(arg14);
        if(v1 == null) {
            this.zak(1);
            return 0;
        }

        ArrayList v4 = null;
        while(true) {
        label_8:
            if(v1 == null) {
                goto label_272;
            }

            v1_1 = v0.get(v1);
            if(v1_1 != null) {
                break;
            }

            v1 = this.zab(arg14);
        }

        int v6 = 4;
        this.zaql.push(Integer.valueOf(v6));
        int v7 = 0x7B;
        int v8 = 44;
        int v9 = 0x7D;
        int v10 = 110;
        switch(((Field)v1_1).zapq) {
            case 0: {
                if(((Field)v1_1).zapr) {
                    arg15.zaa(((Field)v1_1), this.zaa(arg14, FastParser.zaqm));
                    goto label_252;
                }

                arg15.zaa(((Field)v1_1), this.zad(arg14));
                break;
            }
            case 1: {
                if(((Field)v1_1).zapr) {
                    arg15.zab(((Field)v1_1), this.zaa(arg14, FastParser.zaqs));
                    goto label_252;
                }

                arg15.zaa(((Field)v1_1), this.zaf(arg14));
                break;
            }
            case 2: {
                if(((Field)v1_1).zapr) {
                    arg15.zac(((Field)v1_1), this.zaa(arg14, FastParser.zaqn));
                    goto label_252;
                }

                arg15.zaa(((Field)v1_1), this.zae(arg14));
                break;
            }
            case 3: {
                if(((Field)v1_1).zapr) {
                    arg15.zad(((Field)v1_1), this.zaa(arg14, FastParser.zaqo));
                }
                else {
                    arg15.zaa(((Field)v1_1), this.zag(arg14));
                }

                break;
            }
            case 4: {
                if(((Field)v1_1).zapr) {
                    arg15.zae(((Field)v1_1), this.zaa(arg14, FastParser.zaqp));
                    goto label_252;
                }

                arg15.zaa(((Field)v1_1), this.zah(arg14));
                break;
            }
            case 5: {
                if(((Field)v1_1).zapr) {
                    arg15.zaf(((Field)v1_1), this.zaa(arg14, FastParser.zaqt));
                    goto label_252;
                }

                arg15.zaa(((Field)v1_1), this.zai(arg14));
                break;
            }
            case 6: {
                if(((Field)v1_1).zapr) {
                    arg15.zag(((Field)v1_1), this.zaa(arg14, FastParser.zaqq));
                    goto label_252;
                }
                else {
                    arg15.zaa(((Field)v1_1), this.zaa(arg14, false));
                    goto label_252;
                label_272:
                    this.zak(1);
                    return 1;
                    do {
                    label_99:
                        v7 = this.zaj(arg14);
                        if(v7 != 0) {
                            v10 = 34;
                            if(v7 == v10) {
                                String v7_1 = FastParser.zab(arg14, this.zaqb, this.zaqd, ((char[])v4));
                                if(this.zaj(arg14) != 58) {
                                    v15_1 = "No map value found for key ";
                                    v0_1 = String.valueOf(v7_1);
                                    v15_1 = v0_1.length() != 0 ? v15_1.concat(v0_1) : new String(v15_1);
                                    throw new ParseException(v15_1);
                                }
                                else {
                                    if(this.zaj(arg14) != v10) {
                                        v15_1 = "Expected String value for key ";
                                        v0_1 = String.valueOf(v7_1);
                                        v15_1 = v0_1.length() != 0 ? v15_1.concat(v0_1) : new String(v15_1);
                                        throw new ParseException(v15_1);
                                    }

                                    v5_3.put(v7_1, FastParser.zab(arg14, this.zaqb, this.zaqd, ((char[])v4)));
                                    v7_2 = this.zaj(arg14);
                                    if(v7_2 == v8) {
                                        continue;
                                    }

                                    break;
                                }
                            }
                            else if(v7 != v9) {
                                continue;
                            }
                            else {
                                this.zak(1);
                            }
                        }
                        else {
                            goto label_159;
                        }

                        goto label_147;
                    }
                    while(true);

                    if(v7_2 == v9) {
                        this.zak(1);
                        goto label_147;
                    }

                    v0_2 = new StringBuilder(0x30);
                    v0_2.append("Unexpected character while parsing string map: ");
                    v0_2.append(v7_2);
                    throw new ParseException(v0_2.toString());
                label_159:
                    throw new ParseException("Unexpected EOF");
                }

            label_147:
                arg15.zaa(((Field)v1_1), v5_2);
                break;
            }
            case 7: {
                if(((Field)v1_1).zapr) {
                    arg15.zah(((Field)v1_1), this.zaa(arg14, FastParser.zaqr));
                    goto label_252;
                }

                arg15.zaa(((Field)v1_1), this.zac(arg14));
                break;
            }
            case 8: {
                arg15.zaa(((Field)v1_1), Base64Utils.decode(this.zaa(arg14, this.zaqc, this.zaqe, FastParser.zaqk)));
                break;
            }
            case 9: {
                arg15.zaa(((Field)v1_1), Base64Utils.decodeUrlSafe(this.zaa(arg14, this.zaqc, this.zaqe, FastParser.zaqk)));
                break;
            }
            case 10: {
                v5 = this.zaj(arg14);
                if(v5 == v10) {
                    this.zab(arg14, FastParser.zaqf);
                    v5_2 = ((Map)v4);
                }
                else if(v5 == v7) {
                    this.zaql.push(Integer.valueOf(1));
                    v5_3 = new HashMap();
                    goto label_99;
                }
                else {
                    throw new ParseException("Expected start of a map object");
                }

                goto label_147;
            }
            case 11: {
                if(((Field)v1_1).zapr) {
                    v5 = this.zaj(arg14);
                    if(v5 == v10) {
                        this.zab(arg14, FastParser.zaqf);
                        arg15.addConcreteTypeArrayInternal(((Field)v1_1), ((Field)v1_1).zapu, v4);
                        goto label_252;
                    }

                    this.zaql.push(Integer.valueOf(5));
                    if(v5 == 91) {
                        arg15.addConcreteTypeArrayInternal(((Field)v1_1), ((Field)v1_1).zapu, this.zaa(arg14, ((Field)v1_1)));
                        goto label_252;
                    }

                    throw new ParseException("Expected array start");
                }

                v5 = this.zaj(arg14);
                if(v5 == v10) {
                    this.zab(arg14, FastParser.zaqf);
                    arg15.addConcreteTypeInternal(((Field)v1_1), ((Field)v1_1).zapu, ((FastJsonResponse)v4));
                    goto label_252;
                }

                this.zaql.push(Integer.valueOf(1));
                if(v5 == v7) {
                    try {
                        FastJsonResponse v5_1 = ((Field)v1_1).zacp();
                        this.zaa(arg14, v5_1);
                        arg15.addConcreteTypeInternal(((Field)v1_1), ((Field)v1_1).zapu, v5_1);
                        goto label_252;
                    }
                    catch(IllegalAccessException v14) {
                        throw new ParseException("Error instantiating inner object", ((Throwable)v14));
                    }
                    catch(InstantiationException v14_1) {
                        throw new ParseException("Error instantiating inner object", ((Throwable)v14_1));
                    }
                }

                throw new ParseException("Expected start of object");
            }
            default: {
                int v15 = ((Field)v1_1).zapq;
                StringBuilder v1_2 = new StringBuilder(30);
                v1_2.append("Invalid field type ");
                v1_2.append(v15);
                throw new ParseException(v1_2.toString());
            }
        }

    label_252:
        this.zak(v6);
        this.zak(2);
        char v1_3 = this.zaj(arg14);
        if(v1_3 != v8) {
            if(v1_3 == v9) {
                v1 = ((String)v4);
                goto label_8;
            }

            v0_2 = new StringBuilder(55);
            v0_2.append("Expected end of object or field separator, but found: ");
            v0_2.append(v1_3);
            throw new ParseException(v0_2.toString());
        }

        v1 = this.zaa(arg14);
        goto label_8;
    }

    private final ArrayList zaa(BufferedReader arg5, zaa arg6) throws ParseException, IOException {
        int v0 = this.zaj(arg5);
        if(v0 == 110) {
            this.zab(arg5, FastParser.zaqf);
            return null;
        }

        if(v0 != 91) {
            goto label_33;
        }

        int v1 = 5;
        this.zaql.push(Integer.valueOf(v1));
        ArrayList v0_1 = new ArrayList();
        while(true) {
            arg5.mark(0x400);
            int v2 = this.zaj(arg5);
            if(v2 == 0) {
                goto label_29;
            }

            if(v2 == 44) {
                continue;
            }

            if(v2 == 93) {
                break;
            }

            arg5.reset();
            v0_1.add(arg6.zah(this, arg5));
        }

        this.zak(v1);
        return v0_1;
    label_29:
        throw new ParseException("Unexpected EOF");
    label_33:
        throw new ParseException("Expected start of array");
    }

    static boolean zaa(FastParser arg0, BufferedReader arg1, boolean arg2) throws ParseException, IOException {
        return arg0.zaa(arg1, false);
    }

    private final boolean zaa(BufferedReader arg5, boolean arg6) throws ParseException, IOException {
        char[] v6;
        char v1;
        while(true) {
            v1 = this.zaj(arg5);
            if(v1 != 34) {
                goto label_4;
            }

            if(1 != 0) {
                break;
            }
        }

        throw new ParseException("No boolean value found in string");
    label_4:
        if(v1 != 102) {
            if(v1 != 110) {
                if(v1 == 0x74) {
                    v6 = 1 != 0 ? FastParser.zaqh : FastParser.zaqg;
                    this.zab(arg5, v6);
                    return 1;
                }

                StringBuilder v0 = new StringBuilder(19);
                v0.append("Unexpected token: ");
                v0.append(v1);
                throw new ParseException(v0.toString());
            }

            this.zab(arg5, FastParser.zaqf);
            return 0;
        }

        v6 = 1 != 0 ? FastParser.zaqj : FastParser.zaqi;
        this.zab(arg5, v6);
        return 0;
    }

    private final void zab(BufferedReader arg7, char[] arg8) throws ParseException, IOException {
        int v1;
        for(v1 = 0; true; v1 += v2) {
            if(v1 >= arg8.length) {
                return;
            }

            int v2 = arg7.read(this.zaqb, 0, arg8.length - v1);
            if(v2 == -1) {
                break;
            }

            int v3;
            for(v3 = 0; true; ++v3) {
                if(v3 >= v2) {
                    goto label_23;
                }

                if(arg8[v3 + v1] != this.zaqb[v3]) {
                    break;
                }
            }

            throw new ParseException("Unexpected character");
        label_23:
        }

        throw new ParseException("Unexpected EOF");
    }

    private static String zab(BufferedReader arg9, char[] arg10, StringBuilder arg11, char[] arg12) throws ParseException, IOException {
        int v6;
        arg11.setLength(0);
        arg9.mark(arg10.length);
        int v1 = 0;
        int v2;
        for(v2 = 0; true; v2 = v4) {
            int v3 = arg9.read(arg10);
            if(v3 == -1) {
                break;
            }

            int v4 = v2;
            v2 = v1;
            for(v1 = 0; v1 < v3; ++v1) {
                char v5 = arg10[v1];
                if(Character.isISOControl(v5)) {
                    if(arg12 != null) {
                        v6 = 0;
                        while(true) {
                            if(v6 >= arg12.length) {
                                goto label_27;
                            }
                            else if(arg12[v6] == v5) {
                                v6 = 1;
                            }
                            else {
                                ++v6;
                                continue;
                            }

                            break;
                        }
                    }
                    else {
                    label_27:
                        v6 = 0;
                    }

                    if(v6 != 0) {
                        goto label_34;
                    }

                    throw new ParseException("Unexpected control character while reading string");
                }

            label_34:
                if(v5 == 34 && v2 == 0) {
                    arg11.append(arg10, 0, v1);
                    arg9.reset();
                    arg9.skip(((long)(v1 + 1)));
                    if(v4 != 0) {
                        return JsonUtils.unescapeString(arg11.toString());
                    }
                    else {
                        return arg11.toString();
                    }
                }

                if(v5 == 92) {
                    v2 ^= 1;
                    v4 = 1;
                }
                else {
                    v2 = 0;
                }
            }

            arg11.append(arg10, 0, v3);
            arg9.mark(arg10.length);
            v1 = v2;
        }

        throw new ParseException("Unexpected EOF while parsing string");
    }

    private final String zab(BufferedReader arg15) throws ParseException, IOException {
        StringBuilder v1_1;
        char v0_1;
        int v8;
        int v7;
        arg15.mark(0x400);
        int v0 = this.zaj(arg15);
        int v1 = 92;
        int v2 = 18;
        int v3 = 0x7D;
        int v4 = 44;
        int v5 = 34;
        if(v0 == v5) {
            v7 = -1;
            if(arg15.read(this.zaqa) == v7) {
                goto label_142;
            }

            v0 = this.zaqa[0];
            v8 = 0;
            while(true) {
                if(v0 == v5) {
                    if(v8 != 0) {
                    }
                    else {
                        goto label_102;
                    }
                }

                if(v0 == v1) {
                    v8 ^= 1;
                }
                else {
                    v8 = 0;
                }

                if(arg15.read(this.zaqa) == v7) {
                    goto label_138;
                }

                v0_1 = this.zaqa[0];
                if(Character.isISOControl(v0_1)) {
                    break;
                }
            }

            throw new ParseException("Unexpected control character while reading string");
        label_138:
            throw new ParseException("Unexpected EOF while parsing string");
        }
        else if(v0 != v4) {
            v7 = 0x20;
            v8 = 91;
            int v9 = 1;
            if(v0 == v8) {
                int v10 = 5;
                this.zaql.push(Integer.valueOf(v10));
                arg15.mark(v7);
                v7 = 93;
                if(this.zaj(arg15) == v7) {
                    this.zak(v10);
                }
                else {
                    arg15.reset();
                    v0 = 0;
                    int v11 = 0;
                    while(true) {
                        if(v9 > 0) {
                            char v12 = this.zaj(arg15);
                            if(v12 == 0) {
                                goto label_82;
                            }
                            else if(!Character.isISOControl(v12)) {
                                if(v12 == v5 && v0 == 0) {
                                    v11 ^= 1;
                                }

                                if(v12 == v8 && v11 == 0) {
                                    ++v9;
                                }

                                if(v12 == v7 && v11 == 0) {
                                    --v9;
                                }

                                if(v12 == v1 && v11 != 0) {
                                    v0 ^= 1;
                                    continue;
                                }

                                v0 = 0;
                                continue;
                            }
                            else {
                                break;
                            }
                        }
                        else {
                            goto label_86;
                        }

                        goto label_102;
                    }

                    throw new ParseException("Unexpected control character while reading array");
                label_82:
                    throw new ParseException("Unexpected EOF while parsing array");
                label_86:
                    this.zak(v10);
                }
            }
            else if(v0 != 0x7B) {
                arg15.reset();
                this.zaa(arg15, this.zaqc);
            }
            else {
                this.zaql.push(Integer.valueOf(1));
                arg15.mark(v7);
                v0_1 = this.zaj(arg15);
                if(v0_1 == v3) {
                    this.zak(1);
                }
                else if(v0_1 == v5) {
                    arg15.reset();
                    this.zaa(arg15);
                    do {
                    }
                    while(this.zab(arg15) != null);

                    this.zak(1);
                }
                else {
                    v1_1 = new StringBuilder(v2);
                    v1_1.append("Unexpected token ");
                    v1_1.append(v0_1);
                    throw new ParseException(v1_1.toString());
                }
            }
        }
        else {
            throw new ParseException("Missing value");
        }

    label_102:
        v0_1 = this.zaj(arg15);
        v1 = 2;
        if(v0_1 != v4) {
            if(v0_1 == v3) {
                this.zak(v1);
                return null;
            }

            v1_1 = new StringBuilder(v2);
            v1_1.append("Unexpected token ");
            v1_1.append(v0_1);
            throw new ParseException(v1_1.toString());
        }

        this.zak(v1);
        return this.zaa(arg15);
    label_142:
        throw new ParseException("Unexpected EOF while parsing string");
    }

    static long zab(FastParser arg0, BufferedReader arg1) throws ParseException, IOException {
        return arg0.zae(arg1);
    }

    private final String zac(BufferedReader arg4) throws ParseException, IOException {
        return this.zaa(arg4, this.zaqb, this.zaqd, null);
    }

    static float zac(FastParser arg0, BufferedReader arg1) throws ParseException, IOException {
        return arg0.zag(arg1);
    }

    private final int zad(BufferedReader arg10) throws ParseException, IOException {
        int v0;
        int v5;
        int v3;
        int v2;
        int v10 = this.zaa(arg10, this.zaqc);
        if(v10 == 0) {
            return 0;
        }

        char[] v1 = this.zaqc;
        if(v10 <= 0) {
            goto label_68;
        }

        if(v1[0] == 45) {
            v2 = 1;
            v3 = 1;
            v5 = 0x80000000;
        }
        else {
            v2 = 0;
            v3 = 0;
            v5 = 0x80000001;
        }

        int v6 = 10;
        if(v2 < v10) {
            v0 = v2 + 1;
            v2 = Character.digit(v1[v2], v6);
            if(v2 >= 0) {
                v2 = -v2;
            }
            else {
                throw new ParseException("Unexpected non-digit character");
            }
        }
        else {
            v0 = v2;
            v2 = 0;
        }

        while(true) {
            if(v0 >= v10) {
                goto label_59;
            }

            int v7 = v0 + 1;
            v0 = Character.digit(v1[v0], v6);
            if(v0 < 0) {
                goto label_55;
            }

            if(v2 < 0xF3333334) {
                goto label_51;
            }

            v2 *= 10;
            if(v2 < v5 + v0) {
                break;
            }

            v2 -= v0;
            v0 = v7;
        }

        throw new ParseException("Number too large");
    label_51:
        throw new ParseException("Number too large");
    label_55:
        throw new ParseException("Unexpected non-digit character");
    label_59:
        if(v3 != 0) {
            if(v0 > 1) {
                return v2;
            }

            throw new ParseException("No digits to parse");
        }

        return -v2;
    label_68:
        throw new ParseException("No number to parse");
    }

    static double zad(FastParser arg0, BufferedReader arg1) throws ParseException, IOException {
        return arg0.zah(arg1);
    }

    private final long zae(BufferedReader arg18) throws ParseException, IOException {
        long v11;
        int v3;
        int v2_1;
        int v9;
        long v6;
        FastParser v0 = this;
        int v1 = v0.zaa(arg18, v0.zaqc);
        long v2 = 0;
        if(v1 == 0) {
            return v2;
        }

        char[] v4 = v0.zaqc;
        if(v1 <= 0) {
            goto label_72;
        }

        int v5 = 0;
        if(v4[0] == 45) {
            v6 = -9223372036854775808L;
            v5 = 1;
            v9 = 1;
        }
        else {
            v6 = -9223372036854775807L;
            v9 = 0;
        }

        int v10 = 10;
        if(v5 < v1) {
            v2_1 = v5 + 1;
            v3 = Character.digit(v4[v5], v10);
            if(v3 >= 0) {
                v11 = ((long)(-v3));
            }
            else {
                throw new ParseException("Unexpected non-digit character");
            }
        }
        else {
            v11 = v2;
            v2_1 = v5;
        }

        while(true) {
            if(v2_1 >= v1) {
                goto label_63;
            }

            v3 = v2_1 + 1;
            v2_1 = Character.digit(v4[v2_1], v10);
            if(v2_1 < 0) {
                goto label_59;
            }

            if(v11 < -922337203685477580L) {
                goto label_55;
            }

            v11 *= 10;
            long v13 = ((long)v2_1);
            if(v11 < v6 + v13) {
                break;
            }

            v11 -= v13;
            v2_1 = v3;
        }

        throw new ParseException("Number too large");
    label_55:
        throw new ParseException("Number too large");
    label_59:
        throw new ParseException("Unexpected non-digit character");
    label_63:
        if(v9 != 0) {
            if(v2_1 > 1) {
                return v11;
            }

            throw new ParseException("No digits to parse");
        }

        return -v11;
    label_72:
        throw new ParseException("No number to parse");
    }

    static String zae(FastParser arg0, BufferedReader arg1) throws ParseException, IOException {
        return arg0.zac(arg1);
    }

    private final BigInteger zaf(BufferedReader arg5) throws ParseException, IOException {
        int v5 = this.zaa(arg5, this.zaqc);
        if(v5 == 0) {
            return null;
        }

        return new BigInteger(new String(this.zaqc, 0, v5));
    }

    static BigInteger zaf(FastParser arg0, BufferedReader arg1) throws ParseException, IOException {
        return arg0.zaf(arg1);
    }

    private final float zag(BufferedReader arg4) throws ParseException, IOException {
        int v4 = this.zaa(arg4, this.zaqc);
        if(v4 == 0) {
            return 0;
        }

        return Float.parseFloat(new String(this.zaqc, 0, v4));
    }

    static BigDecimal zag(FastParser arg0, BufferedReader arg1) throws ParseException, IOException {
        return arg0.zai(arg1);
    }

    private final double zah(BufferedReader arg4) throws ParseException, IOException {
        int v4 = this.zaa(arg4, this.zaqc);
        if(v4 == 0) {
            return 0;
        }

        return Double.parseDouble(new String(this.zaqc, 0, v4));
    }

    private final BigDecimal zai(BufferedReader arg5) throws ParseException, IOException {
        int v5 = this.zaa(arg5, this.zaqc);
        if(v5 == 0) {
            return null;
        }

        return new BigDecimal(new String(this.zaqc, 0, v5));
    }

    private final char zaj(BufferedReader arg4) throws ParseException, IOException {
        int v1 = -1;
        if(arg4.read(this.zaqa) == v1) {
            return 0;
        }

        do {
            if(!Character.isWhitespace(this.zaqa[0])) {
                goto label_14;
            }
        }
        while(arg4.read(this.zaqa) != v1);

        return 0;
    label_14:
        return this.zaqa[0];
    }

    private final void zak(int arg5) throws ParseException {
        int v1 = 46;
        if(!this.zaql.isEmpty()) {
            int v0 = this.zaql.pop().intValue();
            if(v0 == arg5) {
                return;
            }

            StringBuilder v3 = new StringBuilder(v1);
            v3.append("Expected state ");
            v3.append(arg5);
            v3.append(" but had ");
            v3.append(v0);
            throw new ParseException(v3.toString());
        }

        StringBuilder v2 = new StringBuilder(v1);
        v2.append("Expected state ");
        v2.append(arg5);
        v2.append(" but had empty stack");
        throw new ParseException(v2.toString());
    }
}

