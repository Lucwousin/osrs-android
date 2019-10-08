package com.appsflyer;

final class q implements c {
    enum a {
        private static enum a ʻ;
        private static enum a ʼ;
        private String ʽ;
        private static enum a ˊ;
        private static enum a ˋ;
        private static enum a ˎ;
        public static final enum a ˏ;
        private static enum a ॱ;
        private String ॱॱ;
        private static enum a ᐝ;

        static {
            a.ॱ = new a("UNITY", 0, "android_unity", "com.unity3d.player.UnityPlayer");
            a.ˋ = new a("REACT_NATIVE", 1, "android_reactNative", "com.facebook.react.ReactApplication");
            a.ˎ = new a("CORDOVA", 2, "android_cordova", "org.apache.cordova.CordovaActivity");
            a.ˊ = new a("SEGMENT", 3, "android_segment", "com.segment.analytics.integrations.Integration");
            a.ᐝ = new a("COCOS2DX", 4, "android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity");
            a.ˏ = new a("DEFAULT", 5, "android_native", "android_native");
            a.ʻ = new a("ADOBE_EX", 6, "android_adobe_ex", "com.appsflyer.adobeextension");
            a.ʼ = new a("FLUTTER", 7, "android_flutter", "io.flutter.plugin.common.MethodChannel.MethodCallHandler");
            a.ˊॱ = new a[]{a.ॱ, a.ˋ, a.ˎ, a.ˊ, a.ᐝ, a.ˏ, a.ʻ, a.ʼ};
        }

        private a(String arg1, int arg2, String arg3, String arg4) {
            super(arg1, arg2);
            this.ॱॱ = arg3;
            this.ʽ = arg4;
        }

        public static a valueOf(String arg1) {
            return Enum.valueOf(a.class, arg1);
        }

        public static a[] values() {
            return a.ˊॱ.clone();
        }

        static String ˊ(a arg0) {
            return arg0.ॱॱ;
        }

        static String ˏ(a arg0) {
            return arg0.ʽ;
        }
    }

    interface c {
        Class ˏ(String arg1) throws ClassNotFoundException;
    }

    private c ˏ;

    q() {
        super();
        this.ˏ = ((c)this);
    }

    final String ˎ() {
        a[] v0 = a.values();
        int v1 = v0.length;
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            a v3 = v0[v2];
            if(this.ॱ(a.ˏ(v3))) {
                return a.ˊ(v3);
            }
        }

        return a.ˊ(a.ˏ);
    }

    public final Class ˏ(String arg1) throws ClassNotFoundException {
        return Class.forName(arg1);
    }

    private boolean ॱ(String arg4) {
        try {
            this.ˏ.ˏ(arg4);
            StringBuilder v1 = new StringBuilder("Class: ");
            v1.append(arg4);
            v1.append(" is found.");
            AFLogger.afRDLog(v1.toString());
            return 1;
        }
        catch(Throwable v4) {
            AFLogger.afErrorLog(v4.getMessage(), v4);
            return 0;
        }
        catch(ClassNotFoundException ) {
            return 0;
        }
    }
}

