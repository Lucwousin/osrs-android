package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public final class zzd implements Runnable {
    private static final Logger zzbd;
    private final String zzbe;
    private final StatusPendingResult zzbf;

    static {
        zzd.zzbd = new Logger("RevokeAccessOperation", new String[0]);
    }

    private zzd(String arg2) {
        super();
        Preconditions.checkNotEmpty(arg2);
        this.zzbe = arg2;
        this.zzbf = new StatusPendingResult(null);
    }

    public final void run() {
        String v2_4;
        Logger v3_1;
        String v4;
        Status v0 = Status.RESULT_INTERNAL_ERROR;
        try {
            String v3 = String.valueOf("https://accounts.google.com/o/oauth2/revoke?token=");
            v4 = String.valueOf(this.zzbe);
            v3 = v4.length() != 0 ? v3.concat(v4) : new String(v3);
            URLConnection v2_2 = new URL(v3).openConnection();
            ((HttpURLConnection)v2_2).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int v2_3 = ((HttpURLConnection)v2_2).getResponseCode();
            if(v2_3 == 200) {
                v0 = Status.RESULT_SUCCESS;
            }
            else {
                zzd.zzbd.e("Unable to revoke access!", new Object[0]);
            }

            v3_1 = zzd.zzbd;
            StringBuilder v5 = new StringBuilder(26);
            v5.append("Response Code: ");
            v5.append(v2_3);
            v3_1.d(v5.toString(), new Object[0]);
        }
        catch(Exception v2) {
            v3_1 = zzd.zzbd;
            v4 = "Exception when revoking access: ";
            v2_4 = String.valueOf(v2.toString());
            v2_4 = v2_4.length() != 0 ? v4.concat(v2_4) : new String(v4);
            v3_1.e(v2_4, new Object[0]);
        }
        catch(IOException v2_1) {
            v3_1 = zzd.zzbd;
            v4 = "IOException when revoking access: ";
            v2_4 = String.valueOf(v2_1.toString());
            v2_4 = v2_4.length() != 0 ? v4.concat(v2_4) : new String(v4);
            v3_1.e(v2_4, new Object[0]);
        }

        this.zzbf.setResult(((Result)v0));
    }

    public static PendingResult zzc(String arg1) {
        if(arg1 == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }

        zzd v0 = new zzd(arg1);
        new Thread(((Runnable)v0)).start();
        return v0.zzbf;
    }
}

