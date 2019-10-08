package com.appsflyer;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class AFLogger {
    public enum LogLevel {
        public static final enum LogLevel DEBUG;
        public static final enum LogLevel ERROR;
        public static final enum LogLevel INFO;
        public static final enum LogLevel NONE;
        public static final enum LogLevel VERBOSE;
        public static final enum LogLevel WARNING;
        private int ॱ;

        static {
            LogLevel.NONE = new LogLevel("NONE", 0, 0);
            LogLevel.ERROR = new LogLevel("ERROR", 1, 1);
            LogLevel.WARNING = new LogLevel("WARNING", 2, 2);
            LogLevel.INFO = new LogLevel("INFO", 3, 3);
            LogLevel.DEBUG = new LogLevel("DEBUG", 4, 4);
            LogLevel.VERBOSE = new LogLevel("VERBOSE", 5, 5);
            LogLevel.ˋ = new LogLevel[]{LogLevel.NONE, LogLevel.ERROR, LogLevel.WARNING, LogLevel.INFO, LogLevel.DEBUG, LogLevel.VERBOSE};
        }

        private LogLevel(String arg1, int arg2, int arg3) {
            super(arg1, arg2);
            this.ॱ = arg3;
        }

        public final int getLevel() {
            return this.ॱ;
        }

        public static LogLevel valueOf(String arg1) {
            return Enum.valueOf(LogLevel.class, arg1);
        }

        public static LogLevel[] values() {
            return LogLevel.ˋ.clone();
        }
    }

    private static long ˋ;

    static {
        AFLogger.ˋ = System.currentTimeMillis();
    }

    public AFLogger() {
        super();
    }

    public static void afDebugLog(String arg4) {
        int v0 = LogLevel.DEBUG.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel()) ? 1 : 0;
        if(v0 != 0) {
            Log.d("AppsFlyer_4.9.0", AFLogger.ॱ(arg4, false));
        }

        s.ˏ().ˋ("D", AFLogger.ॱ(arg4, true));
    }

    public static void afErrorLog(String arg1, Throwable arg2) {
        AFLogger.ˋ(arg1, arg2, false);
    }

    public static void afErrorLog(String arg0, Throwable arg1, boolean arg2) {
        AFLogger.ˋ(arg0, arg1, arg2);
    }

    public static void afInfoLog(String arg1) {
        AFLogger.afInfoLog(arg1, true);
    }

    public static void afInfoLog(String arg4, boolean arg5) {
        int v0 = LogLevel.INFO.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel()) ? 1 : 0;
        if(v0 != 0) {
            Log.i("AppsFlyer_4.9.0", AFLogger.ॱ(arg4, false));
        }

        if(arg5) {
            s.ˏ().ˋ("I", AFLogger.ॱ(arg4, true));
        }
    }

    public static void afRDLog(String arg4) {
        int v0 = LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel()) ? 1 : 0;
        if(v0 != 0) {
            Log.v("AppsFlyer_4.9.0", AFLogger.ॱ(arg4, false));
        }

        s.ˏ().ˋ("V", AFLogger.ॱ(arg4, true));
    }

    public static void afWarnLog(String arg0) {
        AFLogger.ˊ(arg0);
    }

    public static void resetDeltaTime() {
        AFLogger.ˋ = System.currentTimeMillis();
    }

    static void ˊ(String arg4) {
        int v0 = LogLevel.WARNING.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel()) ? 1 : 0;
        if(v0 != 0) {
            Log.w("AppsFlyer_4.9.0", AFLogger.ॱ(arg4, false));
        }

        s.ˏ().ˋ("W", AFLogger.ॱ(arg4, true));
    }

    private static String ˊ(long arg9) {
        long v0 = TimeUnit.MILLISECONDS.toHours(arg9);
        arg9 -= TimeUnit.HOURS.toMillis(v0);
        long v2 = TimeUnit.MILLISECONDS.toMinutes(arg9);
        arg9 -= TimeUnit.MINUTES.toMillis(v2);
        long v4 = TimeUnit.MILLISECONDS.toSeconds(arg9);
        return String.format(Locale.getDefault(), "%02d:%02d:%02d:%03d", Long.valueOf(v0), Long.valueOf(v2), Long.valueOf(v4), Long.valueOf(TimeUnit.MILLISECONDS.toMillis(arg9 - TimeUnit.SECONDS.toMillis(v4))));
    }

    private static void ˋ(String arg4, Throwable arg5, boolean arg6) {
        int v0 = LogLevel.ERROR.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel()) ? 1 : 0;
        if(v0 != 0 && (arg6)) {
            Log.e("AppsFlyer_4.9.0", AFLogger.ॱ(arg4, false), arg5);
        }

        s.ˏ().ˏ(arg5);
    }

    static void ˏ(String arg2) {
        if(!AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            Log.d("AppsFlyer_4.9.0", AFLogger.ॱ(arg2, false));
        }

        s.ˏ().ˋ("F", arg2);
    }

    @NonNull private static String ॱ(String arg4, boolean arg5) {
        if(!arg5) {
            if(LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            }
            else {
                return arg4;
            }
        }

        StringBuilder v5 = new StringBuilder("(");
        v5.append(AFLogger.ˊ(System.currentTimeMillis() - AFLogger.ˋ));
        v5.append(") [");
        v5.append(Thread.currentThread().getName());
        v5.append("] ");
        v5.append(arg4);
        return v5.toString();
    }
}

