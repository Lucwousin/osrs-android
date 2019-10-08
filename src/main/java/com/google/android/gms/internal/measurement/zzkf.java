package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

final class zzkf extends SSLSocket {
    private final SSLSocket zzatc;

    zzkf(zzke arg1, SSLSocket arg2) {
        super();
        this.zzatc = arg2;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener arg2) {
        this.zzatc.addHandshakeCompletedListener(arg2);
    }

    public final void bind(SocketAddress arg2) throws IOException {
        this.zzatc.bind(arg2);
    }

    public final void close() throws IOException {
        __monitor_enter(this);
        try {
            this.zzatc.close();
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    public final void connect(SocketAddress arg2) throws IOException {
        this.zzatc.connect(arg2);
    }

    public final void connect(SocketAddress arg2, int arg3) throws IOException {
        this.zzatc.connect(arg2, arg3);
    }

    public final boolean equals(Object arg2) {
        return this.zzatc.equals(arg2);
    }

    public final SocketChannel getChannel() {
        return this.zzatc.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.zzatc.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.zzatc.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.zzatc.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.zzatc.getInetAddress();
    }

    public final InputStream getInputStream() throws IOException {
        return this.zzatc.getInputStream();
    }

    public final boolean getKeepAlive() throws SocketException {
        return this.zzatc.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.zzatc.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.zzatc.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.zzatc.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.zzatc.getNeedClientAuth();
    }

    public final boolean getOOBInline() throws SocketException {
        return this.zzatc.getOOBInline();
    }

    public final OutputStream getOutputStream() throws IOException {
        return this.zzatc.getOutputStream();
    }

    public final int getPort() {
        return this.zzatc.getPort();
    }

    public final int getReceiveBufferSize() throws SocketException {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.zzatc.getReceiveBufferSize();
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.zzatc.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() throws SocketException {
        return this.zzatc.getReuseAddress();
    }

    public final int getSendBufferSize() throws SocketException {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.zzatc.getSendBufferSize();
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public final SSLSession getSession() {
        return this.zzatc.getSession();
    }

    public final int getSoLinger() throws SocketException {
        return this.zzatc.getSoLinger();
    }

    public final int getSoTimeout() throws SocketException {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.zzatc.getSoTimeout();
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public final String[] getSupportedCipherSuites() {
        return this.zzatc.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.zzatc.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() throws SocketException {
        return this.zzatc.getTcpNoDelay();
    }

    public final int getTrafficClass() throws SocketException {
        return this.zzatc.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.zzatc.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.zzatc.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.zzatc.isBound();
    }

    public final boolean isClosed() {
        return this.zzatc.isClosed();
    }

    public final boolean isConnected() {
        return this.zzatc.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.zzatc.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.zzatc.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener arg2) {
        this.zzatc.removeHandshakeCompletedListener(arg2);
    }

    public final void sendUrgentData(int arg2) throws IOException {
        this.zzatc.sendUrgentData(arg2);
    }

    public final void setEnableSessionCreation(boolean arg2) {
        this.zzatc.setEnableSessionCreation(arg2);
    }

    public final void setEnabledCipherSuites(String[] arg2) {
        this.zzatc.setEnabledCipherSuites(arg2);
    }

    public final void setEnabledProtocols(String[] arg3) {
        Object[] v3_1;
        if(arg3 != null && (Arrays.asList(((Object[])arg3)).contains("SSLv3"))) {
            ArrayList v3 = new ArrayList(Arrays.asList(this.zzatc.getEnabledProtocols()));
            if(((List)v3).size() > 1) {
                ((List)v3).remove("SSLv3");
            }

            v3_1 = ((List)v3).toArray(new String[((List)v3).size()]);
        }

        this.zzatc.setEnabledProtocols(((String[])v3_1));
    }

    public final void setKeepAlive(boolean arg2) throws SocketException {
        this.zzatc.setKeepAlive(arg2);
    }

    public final void setNeedClientAuth(boolean arg2) {
        this.zzatc.setNeedClientAuth(arg2);
    }

    public final void setOOBInline(boolean arg2) throws SocketException {
        this.zzatc.setOOBInline(arg2);
    }

    public final void setPerformancePreferences(int arg2, int arg3, int arg4) {
        this.zzatc.setPerformancePreferences(arg2, arg3, arg4);
    }

    public final void setReceiveBufferSize(int arg2) throws SocketException {
        __monitor_enter(this);
        try {
            this.zzatc.setReceiveBufferSize(arg2);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public final void setReuseAddress(boolean arg2) throws SocketException {
        this.zzatc.setReuseAddress(arg2);
    }

    public final void setSendBufferSize(int arg2) throws SocketException {
        __monitor_enter(this);
        try {
            this.zzatc.setSendBufferSize(arg2);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public final void setSoLinger(boolean arg2, int arg3) throws SocketException {
        this.zzatc.setSoLinger(arg2, arg3);
    }

    public final void setSoTimeout(int arg2) throws SocketException {
        __monitor_enter(this);
        try {
            this.zzatc.setSoTimeout(arg2);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public final void setTcpNoDelay(boolean arg2) throws SocketException {
        this.zzatc.setTcpNoDelay(arg2);
    }

    public final void setTrafficClass(int arg2) throws SocketException {
        this.zzatc.setTrafficClass(arg2);
    }

    public final void setUseClientMode(boolean arg2) {
        this.zzatc.setUseClientMode(arg2);
    }

    public final void setWantClientAuth(boolean arg2) {
        this.zzatc.setWantClientAuth(arg2);
    }

    public final void shutdownInput() throws IOException {
        this.zzatc.shutdownInput();
    }

    public final void shutdownOutput() throws IOException {
        this.zzatc.shutdownOutput();
    }

    public final void startHandshake() throws IOException {
        this.zzatc.startHandshake();
    }

    public final String toString() {
        return this.zzatc.toString();
    }
}

