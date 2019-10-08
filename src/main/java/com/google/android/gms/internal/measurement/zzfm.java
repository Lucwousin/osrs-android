package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build$VERSION;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class zzfm extends zzjs {
    private final SSLSocketFactory zzalf;

    public zzfm(zzjt arg2) {
        SSLSocketFactory v2_1;
        super(arg2);
        if(Build$VERSION.SDK_INT < 19) {
            zzke v2 = new zzke();
        }
        else {
            v2_1 = null;
        }

        this.zzalf = v2_1;
    }

    public final Context getContext() {
        return super.getContext();
    }

    static byte[] zza(zzfm arg0, HttpURLConnection arg1) throws IOException {
        return zzfm.zzb(arg1);
    }

    public final void zzab() {
        super.zzab();
    }

    @WorkerThread @VisibleForTesting protected final HttpURLConnection zzb(URL arg3) throws IOException {
        URLConnection v3 = arg3.openConnection();
        if((v3 instanceof HttpURLConnection)) {
            if(this.zzalf != null && ((v3 instanceof HttpsURLConnection))) {
                v3.setSSLSocketFactory(this.zzalf);
            }

            ((HttpURLConnection)v3).setDefaultUseCaches(false);
            ((HttpURLConnection)v3).setConnectTimeout(60000);
            ((HttpURLConnection)v3).setReadTimeout(61000);
            ((HttpURLConnection)v3).setInstanceFollowRedirects(false);
            ((HttpURLConnection)v3).setDoInput(true);
            return ((HttpURLConnection)v3);
        }

        throw new IOException("Failed to obtain HTTP connection");
    }

    @WorkerThread private static byte[] zzb(HttpURLConnection arg5) throws IOException {
        byte[] v0_2;
        Throwable v0_1;
        int v0;
        InputStream v5_1;
        ByteArrayOutputStream v1;
        try {
            v1 = new ByteArrayOutputStream();
            v5_1 = arg5.getInputStream();
            v0 = 0x400;
        }
        catch(Throwable v5) {
            InputStream v4 = ((InputStream)v0);
            v0_1 = v5;
            v5_1 = v4;
            goto label_21;
        }

        try {
            v0_2 = new byte[v0];
            while(true) {
                int v2 = v5_1.read(v0_2);
                if(v2 <= 0) {
                    break;
                }

                v1.write(v0_2, 0, v2);
            }

            v0_2 = v1.toByteArray();
            if(v5_1 != null) {
                goto label_13;
            }

            return v0_2;
        }
        catch(Throwable v0_1) {
            goto label_21;
        }

    label_13:
        v5_1.close();
        return v0_2;
    label_21:
        if(v5_1 != null) {
            v5_1.close();
        }

        throw v0_1;
    }

    public final Clock zzbt() {
        return super.zzbt();
    }

    public final boolean zzex() {
        NetworkInfo v0_1;
        ((zzjs)this).zzch();
        Object v0 = ((zzhi)this).getContext().getSystemService("connectivity");
        try {
            v0_1 = ((ConnectivityManager)v0).getActiveNetworkInfo();
        }
        catch(SecurityException ) {
            v0_1 = null;
        }

        if(v0_1 != null && (v0_1.isConnected())) {
            return 1;
        }

        return 0;
    }

    public final void zzfu() {
        super.zzfu();
    }

    public final void zzfv() {
        super.zzfv();
    }

    public final void zzfw() {
        super.zzfw();
    }

    public final zzer zzge() {
        return super.zzge();
    }

    public final zzfg zzgf() {
        return super.zzgf();
    }

    public final zzkd zzgg() {
        return super.zzgg();
    }

    public final zzgi zzgh() {
        return super.zzgh();
    }

    public final zzfi zzgi() {
        return super.zzgi();
    }

    public final zzft zzgj() {
        return super.zzgj();
    }

    public final zzeh zzgk() {
        return super.zzgk();
    }

    public final zzee zzgl() {
        return super.zzgl();
    }

    protected final boolean zzgn() {
        return 0;
    }

    public final zzjz zzjf() {
        return super.zzjf();
    }

    public final zzed zzjg() {
        return super.zzjg();
    }

    public final zzek zzjh() {
        return super.zzjh();
    }
}

