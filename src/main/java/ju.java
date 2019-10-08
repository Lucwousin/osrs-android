import java.util.Hashtable;

public class ju {
    static boolean ab = false;
    static final int al = 1;
    static od au = null;
    public static final int cp = 85;

    ju() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ju.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static void al(int arg1, Hashtable arg2) {
        if(arg1 != 0) {
        }
        else {
            arg2.put("err_missing_config", "Missing com.jagex.config setting");
            arg2.put("err_invalid_config", "Invalid com.jagex.config setting");
            arg2.put("loading_config", "Loading configuration");
            arg2.put("err_load_config", "There was an error loading the game configuration from the website.\nIf you have a firewall, check that this program is allowed to access the Internet.");
            arg2.put("err_decode_config", "Error decoding configuration");
            arg2.put("loaderbox_initial", "Loading...");
            arg2.put("error", "Error");
            arg2.put("quit", "Quit");
            arg2.put("alreadyopen", "Please close your existing game before loading another one");
        }
    }

    static final void al(long arg1) {
        try {
            Thread.sleep(arg1);
            return;
        }
        catch(InterruptedException ) {
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ju.al(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static final void ax(long arg4) {
        long v0 = 0;
        if(arg4 <= v0) {
            return;
        }

        long v2 = 10;
        try {
            if(v0 == arg4 % v2) {
                ju.al(arg4 - 1);
                ju.al(1);
            }
            else {
                ju.al(arg4);
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("ju.ax(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }
}

