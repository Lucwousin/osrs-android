package androidx.core.text.util;

import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestrictTo(value={Scope.LIBRARY_GROUP}) class FindAddress {
    class ZipRange {
        int mException1;
        int mException2;
        int mHigh;
        int mLow;

        ZipRange(int arg1, int arg2, int arg3, int arg4) {
            super();
            this.mLow = arg1;
            this.mHigh = arg2;
            this.mException1 = arg3;
            this.mException2 = arg3;
        }

        boolean matches(String arg3) {
            boolean v0 = false;
            int v3 = Integer.parseInt(arg3.substring(0, 2));
            if(this.mLow <= v3 && v3 <= this.mHigh || (v3 == this.mException1 || v3 == this.mException2)) {
                v0 = true;
            }

            return v0;
        }
    }

    private static final String HOUSE_COMPONENT = "(?:one|\\d+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";
    private static final String HOUSE_END = "(?=[,\"\'\t                　\n\u000B\f\r\u0085  ]|$)";
    private static final String HOUSE_POST_DELIM = ",\"\'\t                　\n\u000B\f\r\u0085  ";
    private static final String HOUSE_PRE_DELIM = ":,\"\'\t                　\n\u000B\f\r\u0085  ";
    private static final int MAX_ADDRESS_LINES = 5;
    private static final int MAX_ADDRESS_WORDS = 14;
    private static final int MAX_LOCATION_NAME_DISTANCE = 5;
    private static final int MIN_ADDRESS_WORDS = 4;
    private static final String NL = "\n\u000B\f\r\u0085  ";
    private static final String SP = "\t                　";
    private static final String WORD_DELIM = ",*•\t                　\n\u000B\f\r\u0085  ";
    private static final String WORD_END = "(?=[,*•\t                　\n\u000B\f\r\u0085  ]|$)";
    private static final String WS = "\t                　\n\u000B\f\r\u0085  ";
    private static final int kMaxAddressNameWordLength = 25;
    private static final Pattern sHouseNumberRe;
    private static final Pattern sLocationNameRe;
    private static final Pattern sStateRe;
    private static final ZipRange[] sStateZipCodeRanges;
    private static final Pattern sSuffixedNumberRe;
    private static final Pattern sWordRe;
    private static final Pattern sZipCodeRe;

    static {
        FindAddress.sStateZipCodeRanges = new ZipRange[]{new ZipRange(99, 99, -1, -1), new ZipRange(35, 36, -1, -1), new ZipRange(71, 72, -1, -1), new ZipRange(0x60, 0x60, -1, -1), new ZipRange(85, 86, -1, -1), new ZipRange(90, 0x60, -1, -1), new ZipRange(80, 81, -1, -1), new ZipRange(6, 6, -1, -1), new ZipRange(20, 20, -1, -1), new ZipRange(19, 19, -1, -1), new ZipRange(0x20, 34, -1, -1), new ZipRange(0x60, 0x60, -1, -1), new ZipRange(30, 0x1F, -1, -1), new ZipRange(0x60, 0x60, -1, -1), new ZipRange(0x60, 0x60, -1, -1), new ZipRange(50, 52, -1, -1), new ZipRange(83, 83, -1, -1), new ZipRange(60, 62, -1, -1), new ZipRange(46, 0x2F, -1, -1), new ZipRange(66, 67, 73, -1), new ZipRange(40, 42, -1, -1), new ZipRange(70, 71, -1, -1), new ZipRange(1, 2, -1, -1), new ZipRange(20, 21, -1, -1), new ZipRange(3, 4, -1, -1), new ZipRange(0x60, 0x60, -1, -1), new ZipRange(0x30, 49, -1, -1), new ZipRange(55, 56, -1, -1), new ZipRange(0x3F, 65, -1, -1), new ZipRange(0x60, 0x60, -1, -1), new ZipRange(38, 39, -1, -1), new ZipRange(55, 56, -1, -1), new ZipRange(27, 28, -1, -1), new ZipRange(58, 58, -1, -1), new ZipRange(68, 69, -1, -1), new ZipRange(3, 4, -1, -1), new ZipRange(7, 8, -1, -1), new ZipRange(87, 88, 86, -1), new ZipRange(88, 89, 0x60, -1), new ZipRange(10, 14, 0, 6), new ZipRange(43, 45, -1, -1), new ZipRange(73, 74, -1, -1), new ZipRange(97, 97, -1, -1), new ZipRange(15, 19, -1, -1), new ZipRange(6, 6, 0, 9), new ZipRange(0x60, 0x60, -1, -1), new ZipRange(2, 2, -1, -1), new ZipRange(29, 29, -1, -1), new ZipRange(57, 57, -1, -1), new ZipRange(37, 38, -1, -1), new ZipRange(75, 0x4F, 87, 88), new ZipRange(84, 84, -1, -1), new ZipRange(22, 24, 20, -1), new ZipRange(6, 9, -1, -1), new ZipRange(5, 5, -1, -1), new ZipRange(98, 99, -1, -1), new ZipRange(53, 54, -1, -1), new ZipRange(24, 26, -1, -1), new ZipRange(82, 83, -1, -1)};
        FindAddress.sWordRe = Pattern.compile("[^,*•\t                　\n\u000B\f\r\u0085  ]+(?=[,*•\t                　\n\u000B\f\r\u0085  ]|$)", 2);
        FindAddress.sHouseNumberRe = Pattern.compile("(?:one|\\d+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|\\d+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"\'\t                　\n\u000B\f\r\u0085  ]|$)", 2);
        FindAddress.sStateRe = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t                　]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t                　]+of[\t                　]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t                　]+states[\t                　]+of[\t                　]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t                　]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t                　]+mariana[\t                　]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t                　]+carolina)|(nd|north[\t                　]+dakota)|(ne|nebraska)|(nh|new[\t                　]+hampshire)|(nj|new[\t                　]+jersey)|(nm|new[\t                　]+mexico)|(nv|nevada)|(ny|new[\t                　]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t                　]+rico)|(pw|palau)|(ri|rhode[\t                　]+island)|(sc|south[\t                　]+carolina)|(sd|south[\t                　]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t                　]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t                　]+virginia)|(wy|wyoming))(?=[,*•\t                　\n\u000B\f\r\u0085  ]|$)", 2);
        FindAddress.sLocationNameRe = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t                　\n\u000B\f\r\u0085  ]|$)", 2);
        FindAddress.sSuffixedNumberRe = Pattern.compile("(\\d+)(st|nd|rd|th)", 2);
        FindAddress.sZipCodeRe = Pattern.compile("(?:\\d{5}(?:-\\d{4})?)(?=[,*•\t                　\n\u000B\f\r\u0085  ]|$)", 2);
    }

    private FindAddress() {
        super();
    }

    private static int attemptMatch(String arg13, MatchResult arg14) {
        int v14 = arg14.end();
        Matcher v1 = FindAddress.sWordRe.matcher(((CharSequence)arg13));
        int v2 = -1;
        String v9 = "";
        int v0 = 1;
        int v5 = 1;
        int v6 = 1;
        int v7 = -1;
        int v8 = 0;
        int v10 = -1;
        while(v14 < arg13.length()) {
            if(!v1.find(v14)) {
                return -arg13.length();
            }
            else {
                if(v1.end() - v1.start() > 25) {
                    return -v1.end();
                }

                while(v14 < v1.start()) {
                    int v12 = v14 + 1;
                    if("\n\u000B\f\r\u0085  ".indexOf(arg13.charAt(v14)) != v2) {
                        ++v0;
                    }

                    v14 = v12;
                }

                int v11 = 5;
                if(v0 > v11) {
                    break;
                }

                ++v5;
                if(v5 > 14) {
                    break;
                }

                if(FindAddress.matchHouseNumber(arg13, v14) != null) {
                    if(v6 != 0 && v0 > 1) {
                        return -v14;
                    }

                    if(v7 != v2) {
                        goto label_92;
                    }

                    v7 = v14;
                }
                else {
                    if(FindAddress.isValidLocationName(v1.group(0))) {
                        v6 = 0;
                        v8 = 1;
                        goto label_92;
                    }

                    if(v5 == v11 && v8 == 0) {
                        v14 = v1.end();
                        break;
                    }

                    if(v8 != 0 && v5 > 4) {
                        arg14 = FindAddress.matchState(arg13, v14);
                        if(arg14 != null) {
                            if((v9.equals("et")) && (arg14.group(0).equals("al"))) {
                                v14 = arg14.end();
                                break;
                            }

                            Matcher v6_1 = FindAddress.sWordRe.matcher(((CharSequence)arg13));
                            if(v6_1.find(arg14.end())) {
                                if(!FindAddress.isValidZipCode(v6_1.group(0), arg14)) {
                                    goto label_91;
                                }

                                return v6_1.end();
                            }

                            v10 = arg14.end();
                        }
                    }

                label_91:
                    v6 = 0;
                }

            label_92:
                v9 = v1.group(0);
                v14 = v1.end();
                continue;
            }

            break;
        }

        if(v10 > 0) {
            return v10;
        }

        if(v7 > 0) {
            v14 = v7;
        }

        return -v14;
    }

    private static boolean checkHouseNumber(String arg4) {
        int v1 = 0;
        int v2 = 0;
        while(v1 < arg4.length()) {
            if(Character.isDigit(arg4.charAt(v1))) {
                ++v2;
            }

            ++v1;
        }

        if(v2 > 5) {
            return 0;
        }

        Matcher v4 = FindAddress.sSuffixedNumberRe.matcher(((CharSequence)arg4));
        if(!v4.find()) {
            return 1;
        }

        v1 = Integer.parseInt(v4.group(1));
        if(v1 == 0) {
            return 0;
        }

        arg4 = v4.group(2).toLowerCase(Locale.getDefault());
        switch(v1 % 10) {
            case 1: {
                goto label_48;
            }
            case 2: {
                goto label_40;
            }
            case 3: {
                goto label_32;
            }
        }

        return arg4.equals("th");
    label_40:
        String v0 = v1 % 100 == 12 ? "th" : "nd";
        return arg4.equals(v0);
    label_48:
        v0 = v1 % 100 == 11 ? "th" : "st";
        return arg4.equals(v0);
    label_32:
        v0 = v1 % 100 == 13 ? "th" : "rd";
        return arg4.equals(v0);
    }

    static String findAddress(String arg4) {
        Matcher v0 = FindAddress.sHouseNumberRe.matcher(((CharSequence)arg4));
        int v2;
        for(v2 = 0; v0.find(v2); v2 = v0.end()) {
            if(FindAddress.checkHouseNumber(v0.group(0))) {
                v2 = v0.start();
                int v3 = FindAddress.attemptMatch(arg4, ((MatchResult)v0));
                if(v3 > 0) {
                    return arg4.substring(v2, v3);
                }

                v2 = -v3;
                continue;
            }
        }

        return null;
    }

    @VisibleForTesting public static boolean isValidLocationName(String arg1) {
        return FindAddress.sLocationNameRe.matcher(((CharSequence)arg1)).matches();
    }

    private static boolean isValidZipCode(String arg3, MatchResult arg4) {
        boolean v0 = false;
        if(arg4 == null) {
            return 0;
        }

        int v1 = arg4.groupCount();
        while(v1 > 0) {
            int v2 = v1 - 1;
            if(arg4.group(v1) != null) {
                v1 = v2;
            }
            else {
                v1 = v2;
                continue;
            }

            break;
        }

        if((FindAddress.sZipCodeRe.matcher(((CharSequence)arg3)).matches()) && (FindAddress.sStateZipCodeRanges[v1].matches(arg3))) {
            v0 = true;
        }

        return v0;
    }

    @VisibleForTesting public static boolean isValidZipCode(String arg1) {
        return FindAddress.sZipCodeRe.matcher(((CharSequence)arg1)).matches();
    }

    @VisibleForTesting public static boolean isValidZipCode(String arg1, String arg2) {
        return FindAddress.isValidZipCode(arg1, FindAddress.matchState(arg2, 0));
    }

    @VisibleForTesting public static MatchResult matchHouseNumber(String arg3, int arg4) {
        MatchResult v0 = null;
        if(arg4 > 0 && ":,\"\'\t                　\n\u000B\f\r\u0085  ".indexOf(arg3.charAt(arg4 - 1)) == -1) {
            return v0;
        }

        Matcher v3 = FindAddress.sHouseNumberRe.matcher(((CharSequence)arg3)).region(arg4, arg3.length());
        if(v3.lookingAt()) {
            MatchResult v3_1 = v3.toMatchResult();
            if(FindAddress.checkHouseNumber(v3_1.group(0))) {
                return v3_1;
            }
        }

        return v0;
    }

    @VisibleForTesting public static MatchResult matchState(String arg3, int arg4) {
        MatchResult v0 = null;
        if(arg4 > 0 && ",*•\t                　\n\u000B\f\r\u0085  ".indexOf(arg3.charAt(arg4 - 1)) == -1) {
            return v0;
        }

        Matcher v3 = FindAddress.sStateRe.matcher(((CharSequence)arg3)).region(arg4, arg3.length());
        if(v3.lookingAt()) {
            v0 = v3.toMatchResult();
        }

        return v0;
    }
}

