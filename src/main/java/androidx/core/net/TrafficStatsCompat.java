package androidx.core.net;

import android.net.TrafficStats;
import android.os.Build$VERSION;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public final class TrafficStatsCompat {
    private TrafficStatsCompat() {
        super();
    }

    @Deprecated public static void clearThreadStatsTag() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated public static int getThreadStatsTag() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated public static void incrementOperationCount(int arg0) {
        TrafficStats.incrementOperationCount(arg0);
    }

    @Deprecated public static void incrementOperationCount(int arg0, int arg1) {
        TrafficStats.incrementOperationCount(arg0, arg1);
    }

    @Deprecated public static void setThreadStatsTag(int arg0) {
        TrafficStats.setThreadStatsTag(arg0);
    }

    public static void tagDatagramSocket(@NonNull DatagramSocket arg3) throws SocketException {
        if(Build$VERSION.SDK_INT >= 24) {
            TrafficStats.tagDatagramSocket(arg3);
        }
        else {
            ParcelFileDescriptor v0 = ParcelFileDescriptor.fromDatagramSocket(arg3);
            TrafficStats.tagSocket(new DatagramSocketWrapper(arg3, v0.getFileDescriptor()));
            v0.detachFd();
        }
    }

    @Deprecated public static void tagSocket(Socket arg0) throws SocketException {
        TrafficStats.tagSocket(arg0);
    }

    public static void untagDatagramSocket(@NonNull DatagramSocket arg3) throws SocketException {
        if(Build$VERSION.SDK_INT >= 24) {
            TrafficStats.untagDatagramSocket(arg3);
        }
        else {
            ParcelFileDescriptor v0 = ParcelFileDescriptor.fromDatagramSocket(arg3);
            TrafficStats.untagSocket(new DatagramSocketWrapper(arg3, v0.getFileDescriptor()));
            v0.detachFd();
        }
    }

    @Deprecated public static void untagSocket(Socket arg0) throws SocketException {
        TrafficStats.untagSocket(arg0);
    }
}

