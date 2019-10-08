package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

final class zzke extends SSLSocketFactory {
    private final SSLSocketFactory zzatb;

    zzke() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private zzke(SSLSocketFactory arg1) {
        super();
        this.zzatb = arg1;
    }

    public final Socket createSocket() throws IOException {
        return this.zza(this.zzatb.createSocket());
    }

    public final Socket createSocket(String arg2, int arg3) throws IOException {
        return this.zza(this.zzatb.createSocket(arg2, arg3));
    }

    public final Socket createSocket(String arg2, int arg3, InetAddress arg4, int arg5) throws IOException {
        return this.zza(this.zzatb.createSocket(arg2, arg3, arg4, arg5));
    }

    public final Socket createSocket(InetAddress arg2, int arg3) throws IOException {
        return this.zza(this.zzatb.createSocket(arg2, arg3));
    }

    public final Socket createSocket(InetAddress arg2, int arg3, InetAddress arg4, int arg5) throws IOException {
        return this.zza(this.zzatb.createSocket(arg2, arg3, arg4, arg5));
    }

    public final Socket createSocket(Socket arg2, String arg3, int arg4, boolean arg5) throws IOException {
        return this.zza(this.zzatb.createSocket(arg2, arg3, arg4, arg5));
    }

    public final String[] getDefaultCipherSuites() {
        return this.zzatb.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.zzatb.getSupportedCipherSuites();
    }

    private final SSLSocket zza(SSLSocket arg2) {
        return new zzkf(this, arg2);
    }
}

