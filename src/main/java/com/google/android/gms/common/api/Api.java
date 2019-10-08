package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class Api {
    @KeepForSdk @VisibleForTesting public abstract class AbstractClientBuilder extends BaseClientBuilder {
        public AbstractClientBuilder() {
            super();
        }

        @KeepForSdk public abstract Client buildClient(Context arg1, Looper arg2, ClientSettings arg3, Object arg4, ConnectionCallbacks arg5, OnConnectionFailedListener arg6);
    }

    @KeepForSdk public interface AnyClient {
    }

    @KeepForSdk public class AnyClientKey {
        public AnyClientKey() {
            super();
        }
    }

    public interface ApiOptions {
        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            Account getAccount();
        }

        public interface HasGoogleSignInAccountOptions extends HasOptions {
            GoogleSignInAccount getGoogleSignInAccount();
        }

        public interface HasOptions extends ApiOptions {
        }

        public final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
                super();
            }
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }

    }

    @KeepForSdk @VisibleForTesting public class BaseClientBuilder {
        @KeepForSdk public static final int API_PRIORITY_GAMES = 1;
        @KeepForSdk public static final int API_PRIORITY_OTHER = 0x7FFFFFFF;
        @KeepForSdk public static final int API_PRIORITY_PLUS = 2;

        public BaseClientBuilder() {
            super();
        }

        @KeepForSdk public List getImpliedScopes(Object arg1) {
            return Collections.emptyList();
        }

        @KeepForSdk public int getPriority() {
            return 0x7FFFFFFF;
        }
    }

    @KeepForSdk public interface Client extends AnyClient {
        @KeepForSdk void connect(ConnectionProgressReportCallbacks arg1);

        @KeepForSdk void disconnect();

        @KeepForSdk void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

        @KeepForSdk Feature[] getAvailableFeatures();

        @KeepForSdk String getEndpointPackageName();

        @KeepForSdk int getMinApkVersion();

        @KeepForSdk void getRemoteService(IAccountAccessor arg1, Set arg2);

        @KeepForSdk Feature[] getRequiredFeatures();

        @Nullable @KeepForSdk IBinder getServiceBrokerBinder();

        @KeepForSdk Intent getSignInIntent();

        @KeepForSdk boolean isConnected();

        @KeepForSdk boolean isConnecting();

        @KeepForSdk void onUserSignOut(SignOutCallbacks arg1);

        @KeepForSdk boolean providesSignIn();

        @KeepForSdk boolean requiresAccount();

        @KeepForSdk boolean requiresGooglePlayServices();

        @KeepForSdk boolean requiresSignIn();
    }

    @KeepForSdk @VisibleForTesting public final class ClientKey extends AnyClientKey {
        public ClientKey() {
            super();
        }
    }

    public interface SimpleClient extends AnyClient {
        IInterface createServiceInterface(IBinder arg1);

        Context getContext();

        String getServiceDescriptor();

        String getStartServiceAction();

        void setState(int arg1, IInterface arg2);
    }

    @VisibleForTesting public class zaa extends BaseClientBuilder {
    }

    @VisibleForTesting public final class zab extends AnyClientKey {
    }

    private final String mName;
    private final AbstractClientBuilder zaau;
    private final zaa zaav;
    private final ClientKey zaaw;
    private final zab zaax;

    public Api(String arg2, AbstractClientBuilder arg3, ClientKey arg4) {
        super();
        Preconditions.checkNotNull(arg3, "Cannot construct an Api with a null ClientBuilder");
        Preconditions.checkNotNull(arg4, "Cannot construct an Api with a null ClientKey");
        this.mName = arg2;
        this.zaau = arg3;
        this.zaav = null;
        this.zaaw = arg4;
        this.zaax = null;
    }

    public final AnyClientKey getClientKey() {
        if(this.zaaw != null) {
            return this.zaaw;
        }

        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    public final String getName() {
        return this.mName;
    }

    public final BaseClientBuilder zah() {
        return this.zaau;
    }

    public final AbstractClientBuilder zai() {
        boolean v0 = this.zaau != null ? true : false;
        Preconditions.checkState(v0, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.zaau;
    }
}

