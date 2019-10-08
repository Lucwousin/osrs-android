package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.GoogleApiManager$zaa;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.common.api.internal.zabp;
import com.google.android.gms.common.api.internal.zace;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@KeepForSdk public class GoogleApi {
    @KeepForSdk public class Settings {
        @KeepForSdk public class Builder {
            private Looper zabj;
            private StatusExceptionMapper zabl;

            @KeepForSdk public Builder() {
                super();
            }

            @KeepForSdk public Settings build() {
                if(this.zabl == null) {
                    this.zabl = new ApiExceptionMapper();
                }

                if(this.zabj == null) {
                    this.zabj = Looper.getMainLooper();
                }

                return new Settings(this.zabl, null, this.zabj, null);
            }

            @KeepForSdk public Builder setLooper(Looper arg2) {
                Preconditions.checkNotNull(arg2, "Looper must not be null.");
                this.zabj = arg2;
                return this;
            }

            @KeepForSdk public Builder setMapper(StatusExceptionMapper arg2) {
                Preconditions.checkNotNull(arg2, "StatusExceptionMapper must not be null.");
                this.zabl = arg2;
                return this;
            }
        }

        @KeepForSdk public static final Settings DEFAULT_SETTINGS;
        public final StatusExceptionMapper zabn;
        public final Looper zabo;

        static {
            Settings.DEFAULT_SETTINGS = new Builder().build();
        }

        @KeepForSdk private Settings(StatusExceptionMapper arg1, Account arg2, Looper arg3) {
            super();
            this.zabn = arg1;
            this.zabo = arg3;
        }

        Settings(StatusExceptionMapper arg1, Account arg2, Looper arg3, zab arg4) {
            this(arg1, null, arg3);
        }
    }

    private final Api mApi;
    private final Context mContext;
    private final int mId;
    private final ApiOptions zabh;
    private final zai zabi;
    private final Looper zabj;
    private final GoogleApiClient zabk;
    private final StatusExceptionMapper zabl;
    protected final GoogleApiManager zabm;

    @MainThread @KeepForSdk public GoogleApi(@NonNull Activity arg2, Api arg3, ApiOptions arg4, Settings arg5) {
        super();
        Preconditions.checkNotNull(arg2, "Null activity is not permitted.");
        Preconditions.checkNotNull(arg3, "Api must not be null.");
        Preconditions.checkNotNull(arg5, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.mContext = arg2.getApplicationContext();
        this.mApi = arg3;
        this.zabh = arg4;
        this.zabj = arg5.zabo;
        this.zabi = zai.zaa(this.mApi, this.zabh);
        this.zabk = new zabp(this);
        this.zabm = GoogleApiManager.zab(this.mContext);
        this.mId = this.zabm.zabd();
        this.zabl = arg5.zabn;
        if(!(arg2 instanceof GoogleApiActivity)) {
            zaae.zaa(arg2, this.zabm, this.zabi);
        }

        this.zabm.zaa(this);
    }

    @KeepForSdk @Deprecated public GoogleApi(@NonNull Activity arg2, Api arg3, ApiOptions arg4, StatusExceptionMapper arg5) {
        this(arg2, arg3, arg4, new Builder().setMapper(arg5).setLooper(arg2.getMainLooper()).build());
    }

    @KeepForSdk protected GoogleApi(@NonNull Context arg2, Api arg3, Looper arg4) {
        super();
        Preconditions.checkNotNull(arg2, "Null context is not permitted.");
        Preconditions.checkNotNull(arg3, "Api must not be null.");
        Preconditions.checkNotNull(arg4, "Looper must not be null.");
        this.mContext = arg2.getApplicationContext();
        this.mApi = arg3;
        this.zabh = null;
        this.zabj = arg4;
        this.zabi = zai.zaa(arg3);
        this.zabk = new zabp(this);
        this.zabm = GoogleApiManager.zab(this.mContext);
        this.mId = this.zabm.zabd();
        this.zabl = new ApiExceptionMapper();
    }

    @KeepForSdk @Deprecated public GoogleApi(@NonNull Context arg2, Api arg3, ApiOptions arg4, Looper arg5, StatusExceptionMapper arg6) {
        this(arg2, arg3, arg4, new Builder().setLooper(arg5).setMapper(arg6).build());
    }

    @KeepForSdk public GoogleApi(@NonNull Context arg2, Api arg3, ApiOptions arg4, Settings arg5) {
        super();
        Preconditions.checkNotNull(arg2, "Null context is not permitted.");
        Preconditions.checkNotNull(arg3, "Api must not be null.");
        Preconditions.checkNotNull(arg5, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.mContext = arg2.getApplicationContext();
        this.mApi = arg3;
        this.zabh = arg4;
        this.zabj = arg5.zabo;
        this.zabi = zai.zaa(this.mApi, this.zabh);
        this.zabk = new zabp(this);
        this.zabm = GoogleApiManager.zab(this.mContext);
        this.mId = this.zabm.zabd();
        this.zabl = arg5.zabn;
        this.zabm.zaa(this);
    }

    @KeepForSdk @Deprecated public GoogleApi(@NonNull Context arg2, Api arg3, ApiOptions arg4, StatusExceptionMapper arg5) {
        this(arg2, arg3, arg4, new Builder().setMapper(arg5).build());
    }

    @KeepForSdk public GoogleApiClient asGoogleApiClient() {
        return this.zabk;
    }

    @KeepForSdk protected com.google.android.gms.common.internal.ClientSettings$Builder createClientSettingsBuilder() {
        Set v1_2;
        Account v1_1;
        GoogleSignInAccount v1;
        com.google.android.gms.common.internal.ClientSettings$Builder v0 = new com.google.android.gms.common.internal.ClientSettings$Builder();
        if((this.zabh instanceof HasGoogleSignInAccountOptions)) {
            v1 = this.zabh.getGoogleSignInAccount();
            if(v1 != null) {
                v1_1 = v1.getAccount();
            }
            else {
                goto label_10;
            }
        }
        else {
        label_10:
            v1_1 = (this.zabh instanceof HasAccountOptions) ? this.zabh.getAccount() : null;
        }

        v0 = v0.setAccount(v1_1);
        if((this.zabh instanceof HasGoogleSignInAccountOptions)) {
            v1 = this.zabh.getGoogleSignInAccount();
            if(v1 != null) {
                v1_2 = v1.getRequestedScopes();
            }
            else {
                goto label_26;
            }
        }
        else {
        label_26:
            v1_2 = Collections.emptySet();
        }

        return v0.addAllRequiredScopes(((Collection)v1_2)).setRealClientClassName(this.mContext.getClass().getName()).setRealClientPackageName(this.mContext.getPackageName());
    }

    @KeepForSdk protected Task disconnectService() {
        return this.zabm.zac(this);
    }

    @KeepForSdk public ApiMethodImpl doBestEffortWrite(@NonNull ApiMethodImpl arg2) {
        return this.zaa(2, arg2);
    }

    @KeepForSdk public Task doBestEffortWrite(TaskApiCall arg2) {
        return this.zaa(2, arg2);
    }

    @KeepForSdk public ApiMethodImpl doRead(@NonNull ApiMethodImpl arg2) {
        return this.zaa(0, arg2);
    }

    @KeepForSdk public Task doRead(TaskApiCall arg2) {
        return this.zaa(0, arg2);
    }

    @KeepForSdk @Deprecated public Task doRegisterEventListener(@NonNull RegisterListenerMethod arg3, UnregisterListenerMethod arg4) {
        Preconditions.checkNotNull(arg3);
        Preconditions.checkNotNull(arg4);
        Preconditions.checkNotNull(arg3.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(arg4.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(arg3.getListenerKey().equals(arg4.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zabm.zaa(this, arg3, arg4);
    }

    @KeepForSdk public Task doRegisterEventListener(@NonNull RegistrationMethods arg3) {
        Preconditions.checkNotNull(arg3);
        Preconditions.checkNotNull(arg3.zajy.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(arg3.zajz.getListenerKey(), "Listener has already been released.");
        return this.zabm.zaa(this, arg3.zajy, arg3.zajz);
    }

    @KeepForSdk public Task doUnregisterEventListener(@NonNull ListenerKey arg2) {
        Preconditions.checkNotNull(arg2, "Listener key cannot be null.");
        return this.zabm.zaa(this, arg2);
    }

    @KeepForSdk public ApiMethodImpl doWrite(@NonNull ApiMethodImpl arg2) {
        return this.zaa(1, arg2);
    }

    @KeepForSdk public Task doWrite(TaskApiCall arg2) {
        return this.zaa(1, arg2);
    }

    public final Api getApi() {
        return this.mApi;
    }

    @KeepForSdk public ApiOptions getApiOptions() {
        return this.zabh;
    }

    @KeepForSdk public Context getApplicationContext() {
        return this.mContext;
    }

    public final int getInstanceId() {
        return this.mId;
    }

    @KeepForSdk public Looper getLooper() {
        return this.zabj;
    }

    @KeepForSdk public ListenerHolder registerListener(@NonNull Object arg2, String arg3) {
        return ListenerHolders.createListenerHolder(arg2, this.zabj, arg3);
    }

    private final ApiMethodImpl zaa(int arg2, @NonNull ApiMethodImpl arg3) {
        ((BasePendingResult)arg3).zau();
        this.zabm.zaa(this, arg2, arg3);
        return arg3;
    }

    private final Task zaa(int arg8, @NonNull TaskApiCall arg9) {
        TaskCompletionSource v6 = new TaskCompletionSource();
        this.zabm.zaa(this, arg8, arg9, v6, this.zabl);
        return v6.getTask();
    }

    @WorkerThread public Client zaa(Looper arg9, zaa arg10) {
        return this.mApi.zai().buildClient(this.mContext, arg9, this.createClientSettingsBuilder().build(), this.zabh, arg10, arg10);
    }

    public zace zaa(Context arg3, Handler arg4) {
        return new zace(arg3, arg4, this.createClientSettingsBuilder().build());
    }

    public final zai zak() {
        return this.zabi;
    }
}

