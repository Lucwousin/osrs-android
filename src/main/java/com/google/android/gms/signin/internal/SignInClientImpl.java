package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient$LegacyClientCallbackAdapter;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;

@KeepForSdk public class SignInClientImpl extends GmsClient implements zad {
    private final ClientSettings zaes;
    private Integer zaod;
    private final boolean zary;
    private final Bundle zarz;

    public SignInClientImpl(Context arg9, Looper arg10, boolean arg11, ClientSettings arg12, SignInOptions arg13, ConnectionCallbacks arg14, OnConnectionFailedListener arg15) {
        this(arg9, arg10, true, arg12, SignInClientImpl.createBundleFromClientSettings(arg12), arg14, arg15);
    }

    private SignInClientImpl(Context arg8, Looper arg9, boolean arg10, ClientSettings arg11, Bundle arg12, ConnectionCallbacks arg13, OnConnectionFailedListener arg14) {
        super(arg8, arg9, 44, arg11, arg13, arg14);
        this.zary = true;
        this.zaes = arg11;
        this.zarz = arg12;
        this.zaod = arg11.getClientSessionId();
    }

    public final void connect() {
        this.connect(new LegacyClientCallbackAdapter(((BaseGmsClient)this)));
    }

    @KeepForSdk public static Bundle createBundleFromClientSettings(ClientSettings arg5) {
        SignInOptions v0 = arg5.getSignInOptions();
        Integer v1 = arg5.getClientSessionId();
        Bundle v2 = new Bundle();
        v2.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", arg5.getAccount());
        if(v1 != null) {
            v2.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", v1.intValue());
        }

        if(v0 != null) {
            v2.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", v0.isOfflineAccessRequested());
            v2.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", v0.isIdTokenRequested());
            v2.putString("com.google.android.gms.signin.internal.serverClientId", v0.getServerClientId());
            v2.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            v2.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", v0.isForceCodeForRefreshToken());
            v2.putString("com.google.android.gms.signin.internal.hostedDomain", v0.getHostedDomain());
            v2.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", v0.waitForAccessTokenRefresh());
            if(v0.getAuthApiSignInModuleVersion() != null) {
                v2.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", v0.getAuthApiSignInModuleVersion().longValue());
            }

            if(v0.getRealClientLibraryVersion() == null) {
                return v2;
            }

            v2.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", v0.getRealClientLibraryVersion().longValue());
        }

        return v2;
    }

    protected IInterface createServiceInterface(IBinder arg3) {
        if(arg3 == null) {
            return null;
        }

        IInterface v0 = arg3.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if((v0 instanceof zaf)) {
            return v0;
        }

        return new zag(arg3);
    }

    protected Bundle getGetServiceRequestExtraArgs() {
        if(!this.getContext().getPackageName().equals(this.zaes.getRealClientPackageName())) {
            this.zarz.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zaes.getRealClientPackageName());
        }

        return this.zarz;
    }

    public int getMinApkVersion() {
        return 12451000;
    }

    protected String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    public boolean requiresSignIn() {
        return this.zary;
    }

    public final void zaa(IAccountAccessor arg3, boolean arg4) {
        try {
            this.getService().zaa(arg3, this.zaod.intValue(), arg4);
            return;
        }
        catch(RemoteException ) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
            return;
        }
    }

    public final void zaa(com.google.android.gms.signin.internal.zad arg5) {
        Preconditions.checkNotNull(arg5, "Expecting a valid ISignInCallbacks");
        try {
            Account v0_1 = this.zaes.getAccountOrDefault();
            GoogleSignInAccount v1 = null;
            if("<<default account>>".equals(v0_1.name)) {
                v1 = Storage.getInstance(this.getContext()).getSavedDefaultGoogleSignInAccount();
            }

            this.getService().zaa(new zah(new ResolveAccountRequest(v0_1, this.zaod.intValue(), v1)), arg5);
            return;
        }
        catch(RemoteException v0) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                arg5.zab(new zaj(8));
                return;
            }
            catch(RemoteException ) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", ((Throwable)v0));
                return;
            }
        }
    }

    public final void zacv() {
        try {
            this.getService().zam(this.zaod.intValue());
            return;
        }
        catch(RemoteException ) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
            return;
        }
    }
}

