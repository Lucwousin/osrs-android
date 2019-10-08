package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi$Settings$Builder;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzs;
import com.google.android.gms.internal.auth.zzu;
import com.google.android.gms.internal.auth.zzv;
import com.google.android.gms.internal.auth.zzy;
import com.google.android.gms.internal.auth.zzz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class AccountTransferClient extends GoogleApi {
    class zza extends zzs {
        private zzb zzav;

        public zza(zzb arg1) {
            super();
            this.zzav = arg1;
        }

        public final void onFailure(Status arg2) {
            this.zzav.zza(arg2);
        }
    }

    abstract class zzb extends TaskApiCall {
        private TaskCompletionSource zzaw;

        private zzb() {
            super();
        }

        zzb(zzc arg1) {
            this();
        }

        protected void doExecute(AnyClient arg1, TaskCompletionSource arg2) throws RemoteException {
            this.zzaw = arg2;
            this.zza(((zzu)arg1).getService());
        }

        protected final void setResult(Object arg2) {
            this.zzaw.setResult(arg2);
        }

        protected abstract void zza(zzz arg1) throws RemoteException;

        protected final void zza(Status arg2) {
            AccountTransferClient.zzb(this.zzaw, arg2);
        }
    }

    abstract class com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$zzc extends zzb {
        zzy zzax;

        private com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$zzc() {
            super(null);
            this.zzax = new zzk(this);
        }

        com.google.android.gms.auth.api.accounttransfer.AccountTransferClient$zzc(zzc arg1) {
            this();
        }
    }

    private static final ClientKey zzaj;
    private static final AbstractClientBuilder zzak;
    private static final Api zzal;

    static {
        AccountTransferClient.zzaj = new ClientKey();
        AccountTransferClient.zzak = new zzc();
        AccountTransferClient.zzal = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", AccountTransferClient.zzak, AccountTransferClient.zzaj);
    }

    AccountTransferClient(@NonNull Activity arg4) {
        super(arg4, AccountTransferClient.zzal, null, new Builder().setMapper(new ApiExceptionMapper()).build());
    }

    AccountTransferClient(@NonNull Context arg4) {
        super(arg4, AccountTransferClient.zzal, null, new Builder().setMapper(new ApiExceptionMapper()).build());
    }

    public Task getDeviceMetaData(String arg2) {
        Preconditions.checkNotNull(arg2);
        return this.doRead(new zzg(this, new zzv(arg2)));
    }

    public Task notifyCompletion(String arg2, int arg3) {
        Preconditions.checkNotNull(arg2);
        return this.doWrite(new zzj(this, new zzab(arg2, arg3)));
    }

    public Task retrieveData(String arg2) {
        Preconditions.checkNotNull(arg2);
        return this.doRead(new zze(this, new zzad(arg2)));
    }

    public Task sendData(String arg2, byte[] arg3) {
        Preconditions.checkNotNull(arg2);
        Preconditions.checkNotNull(arg3);
        return this.doWrite(new zzd(this, new zzaf(arg2, arg3)));
    }

    public Task showUserChallenge(String arg2, PendingIntent arg3) {
        Preconditions.checkNotNull(arg2);
        Preconditions.checkNotNull(arg3);
        return this.doWrite(new zzi(this, new zzah(arg2, arg3)));
    }

    private static void zza(TaskCompletionSource arg1, Status arg2) {
        arg1.setException(new AccountTransferException(arg2));
    }

    static void zzb(TaskCompletionSource arg0, Status arg1) {
        AccountTransferClient.zza(arg0, arg1);
    }
}

