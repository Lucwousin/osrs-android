package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService$Stub;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

class InstallReferrerClientImpl extends InstallReferrerClient {
    class com.android.installreferrer.api.InstallReferrerClientImpl$1 {
    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED;

    }

    final class InstallReferrerServiceConnection implements ServiceConnection {
        private final InstallReferrerStateListener mListener;

        InstallReferrerServiceConnection(InstallReferrerClientImpl arg1, InstallReferrerStateListener arg2, com.android.installreferrer.api.InstallReferrerClientImpl$1 arg3) {
            this(arg1, arg2);
        }

        private InstallReferrerServiceConnection(@NonNull InstallReferrerClientImpl arg1, InstallReferrerStateListener arg2) {
            InstallReferrerClientImpl.this = arg1;
            super();
            if(arg2 != null) {
                this.mListener = arg2;
                return;
            }

            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public void onServiceConnected(ComponentName arg2, IBinder arg3) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl.this.mService = Stub.asInterface(arg3);
            InstallReferrerClientImpl.this.mClientState = 2;
            this.mListener.onInstallReferrerSetupFinished(0);
        }

        public void onServiceDisconnected(ComponentName arg2) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.mService = null;
            InstallReferrerClientImpl.this.mClientState = 0;
            this.mListener.onInstallReferrerServiceDisconnected();
        }
    }

    private static final int PLAY_STORE_MIN_APP_VER = 80837300;
    private static final String SERVICE_ACTION_NAME = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE";
    private static final String SERVICE_NAME = "com.google.android.finsky.externalreferrer.GetInstallReferrerService";
    private static final String SERVICE_PACKAGE_NAME = "com.android.vending";
    private static final String TAG = "InstallReferrerClient";
    private final Context mApplicationContext;
    private int mClientState;
    private IGetInstallReferrerService mService;
    private ServiceConnection mServiceConnection;

    public InstallReferrerClientImpl(@NonNull Context arg2) {
        super();
        this.mClientState = 0;
        this.mApplicationContext = arg2.getApplicationContext();
    }

    static IGetInstallReferrerService access$102(InstallReferrerClientImpl arg0, IGetInstallReferrerService arg1) {
        arg0.mService = arg1;
        return arg1;
    }

    static int access$202(InstallReferrerClientImpl arg0, int arg1) {
        arg0.mClientState = arg1;
        return arg1;
    }

    public void endConnection() {
        this.mClientState = 3;
        ServiceConnection v1 = null;
        if(this.mServiceConnection != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.mApplicationContext.unbindService(this.mServiceConnection);
            this.mServiceConnection = v1;
        }

        this.mService = ((IGetInstallReferrerService)v1);
    }

    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if(this.isReady()) {
            Bundle v0 = new Bundle();
            v0.putString("package_name", this.mApplicationContext.getPackageName());
            try {
                return new ReferrerDetails(this.mService.getInstallReferrer(v0));
            }
            catch(RemoteException v0_1) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.mClientState = 0;
                throw v0_1;
            }
        }

        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    private boolean isPlayStoreCompatible() {
        PackageManager v0 = this.mApplicationContext.getPackageManager();
        boolean v1 = false;
        try {
            if(v0.getPackageInfo("com.android.vending", 0x80).versionCode < 80837300) {
                return v1;
            }
        }
        catch(PackageManager$NameNotFoundException ) {
            return 0;
        }

        return true;
    }

    public boolean isReady() {
        boolean v0 = this.mClientState != 2 || this.mService == null || this.mServiceConnection == null ? false : true;
        return v0;
    }

    public void startConnection(@NonNull InstallReferrerStateListener arg8) {
        if(this.isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            arg8.onInstallReferrerSetupFinished(0);
            return;
        }

        int v2 = 3;
        if(this.mClientState == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            arg8.onInstallReferrerSetupFinished(v2);
            return;
        }

        if(this.mClientState == v2) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can\'t be reused. Please create another instance.");
            arg8.onInstallReferrerSetupFinished(v2);
            return;
        }

        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        this.mServiceConnection = new InstallReferrerServiceConnection(this, arg8, null);
        Intent v0 = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        v0.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List v2_1 = this.mApplicationContext.getPackageManager().queryIntentServices(v0, 0);
        int v4 = 2;
        if(v2_1 != null && !v2_1.isEmpty()) {
            Object v2_2 = v2_1.get(0);
            if(((ResolveInfo)v2_2).serviceInfo != null) {
                String v5 = ((ResolveInfo)v2_2).serviceInfo.packageName;
                String v2_3 = ((ResolveInfo)v2_2).serviceInfo.name;
                if(("com.android.vending".equals(v5)) && v2_3 != null && (this.isPlayStoreCompatible())) {
                    if(this.mApplicationContext.bindService(new Intent(v0), this.mServiceConnection, 1)) {
                        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    else {
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                        this.mClientState = 0;
                        arg8.onInstallReferrerSetupFinished(1);
                        return;
                    }
                }

                InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.mClientState = 0;
                arg8.onInstallReferrerSetupFinished(v4);
                return;
            }
        }

        this.mClientState = 0;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
        arg8.onInstallReferrerSetupFinished(v4);
    }
}

