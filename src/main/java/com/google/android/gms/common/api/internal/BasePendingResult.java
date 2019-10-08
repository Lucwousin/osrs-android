package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk @KeepName public abstract class BasePendingResult extends PendingResult {
    @VisibleForTesting public class CallbackHandler extends zal {
        public CallbackHandler(Looper arg1) {
            super(arg1);
        }

        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public void handleMessage(Message arg4) {
            switch(arg4.what) {
                case 1: {
                    goto label_19;
                }
                case 2: {
                    goto label_15;
                }
            }

            int v4 = arg4.what;
            StringBuilder v2 = new StringBuilder(45);
            v2.append("Don\'t know how to handle message: ");
            v2.append(v4);
            Log.wtf("BasePendingResult", v2.toString(), new Exception());
            return;
        label_19:
            Object v4_1 = arg4.obj;
            Object v0 = ((Pair)v4_1).first;
            v4_1 = ((Pair)v4_1).second;
            try {
                ((ResultCallback)v0).onResult(((Result)v4_1));
                return;
            }
            catch(RuntimeException v0_1) {
                BasePendingResult.zab(((Result)v4_1));
                throw v0_1;
            }

        label_15:
            arg4.obj.zab(Status.RESULT_TIMEOUT);
        }

        public final void zaa(ResultCallback arg2, Result arg3) {
            this.sendMessage(this.obtainMessage(1, new Pair(arg2, arg3)));
        }
    }

    final class zaa {
        zaa(BasePendingResult arg1, zap arg2) {
            this(arg1);
        }

        private zaa(BasePendingResult arg1) {
            this.zaea = arg1;
            super();
        }

        protected final void finalize() throws Throwable {
            BasePendingResult.zab(BasePendingResult.zaa(this.zaea));
            super.finalize();
        }
    }

    @KeepName private zaa mResultGuardian;
    private Status mStatus;
    private Result zaci;
    static final ThreadLocal zadm;
    private final Object zadn;
    private final CallbackHandler zado;
    private final WeakReference zadp;
    private final CountDownLatch zadq;
    private final ArrayList zadr;
    private ResultCallback zads;
    private final AtomicReference zadt;
    private volatile boolean zadu;
    private boolean zadv;
    private boolean zadw;
    private ICancelToken zadx;
    private volatile zacm zady;
    private boolean zadz;

    static {
        BasePendingResult.zadm = new zap();
    }

    @KeepForSdk @Deprecated protected BasePendingResult(Looper arg3) {
        super();
        this.zadn = new Object();
        this.zadq = new CountDownLatch(1);
        this.zadr = new ArrayList();
        this.zadt = new AtomicReference();
        this.zadz = false;
        this.zado = new CallbackHandler(arg3);
        this.zadp = new WeakReference(null);
    }

    @KeepForSdk protected BasePendingResult(GoogleApiClient arg3) {
        super();
        this.zadn = new Object();
        this.zadq = new CountDownLatch(1);
        this.zadr = new ArrayList();
        this.zadt = new AtomicReference();
        this.zadz = false;
        Looper v0 = arg3 != null ? arg3.getLooper() : Looper.getMainLooper();
        this.zado = new CallbackHandler(v0);
        this.zadp = new WeakReference(arg3);
    }

    @KeepForSdk @VisibleForTesting protected BasePendingResult(@NonNull CallbackHandler arg3) {
        super();
        this.zadn = new Object();
        this.zadq = new CountDownLatch(1);
        this.zadr = new ArrayList();
        this.zadt = new AtomicReference();
        this.zadz = false;
        this.zado = Preconditions.checkNotNull(arg3, "CallbackHandler must not be null");
        this.zadp = new WeakReference(null);
    }

    @Deprecated BasePendingResult() {
        super();
        this.zadn = new Object();
        this.zadq = new CountDownLatch(1);
        this.zadr = new ArrayList();
        this.zadt = new AtomicReference();
        this.zadz = false;
        this.zado = new CallbackHandler(Looper.getMainLooper());
        this.zadp = new WeakReference(null);
    }

    public final void addStatusListener(StatusListener arg3) {
        boolean v0 = arg3 != null ? true : false;
        Preconditions.checkArgument(v0, "Callback cannot be null.");
        Object v0_1 = this.zadn;
        __monitor_enter(v0_1);
        try {
            if(this.isReady()) {
                arg3.onComplete(this.mStatus);
            }
            else {
                this.zadr.add(arg3);
            }

            __monitor_exit(v0_1);
            return;
        label_18:
            __monitor_exit(v0_1);
        }
        catch(Throwable v3) {
            goto label_18;
        }

        throw v3;
    }

    public final Result await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        boolean v1 = true;
        Preconditions.checkState(this.zadu ^ 1, "Result has already been consumed");
        if(this.zady == null) {
        }
        else {
            v1 = false;
        }

        Preconditions.checkState(v1, "Cannot await if then() has been called.");
        try {
            this.zadq.await();
        }
        catch(InterruptedException ) {
            this.zab(Status.RESULT_INTERRUPTED);
        }

        Preconditions.checkState(this.isReady(), "Result is not ready.");
        return this.get();
    }

    public final Result await(long arg4, TimeUnit arg6) {
        if(arg4 > 0) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }

        boolean v1 = true;
        Preconditions.checkState(this.zadu ^ 1, "Result has already been consumed.");
        if(this.zady == null) {
        }
        else {
            v1 = false;
        }

        Preconditions.checkState(v1, "Cannot await if then() has been called.");
        try {
            if(this.zadq.await(arg4, arg6)) {
                goto label_23;
            }

            this.zab(Status.RESULT_TIMEOUT);
        }
        catch(InterruptedException ) {
            this.zab(Status.RESULT_INTERRUPTED);
        }

    label_23:
        Preconditions.checkState(this.isReady(), "Result is not ready.");
        return this.get();
    }

    @KeepForSdk public void cancel() {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            if(!this.zadv) {
                if(this.zadu) {
                }
                else {
                    if(this.zadx != null) {
                        try {
                            this.zadx.cancel();
                            goto label_11;
                        }
                        catch(RemoteException ) {
                        label_11:
                            BasePendingResult.zab(this.zaci);
                            this.zadv = true;
                            this.zaa(this.createFailedResult(Status.RESULT_CANCELED));
                            __monitor_exit(v0);
                            return;
                        }
                    }

                    goto label_11;
                }
            }

            __monitor_exit(v0);
            return;
        label_23:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_23;
        }

        throw v1;
    }

    @NonNull @KeepForSdk protected abstract Result createFailedResult(Status arg1);

    private final Result get() {
        Result v3;
        Result v1_1;
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            Preconditions.checkState(this.zadu ^ 1, "Result has already been consumed.");
            Preconditions.checkState(this.isReady(), "Result is not ready.");
            v1_1 = this.zaci;
            v3 = null;
            this.zaci = v3;
            this.zads = ((ResultCallback)v3);
            this.zadu = true;
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            try {
            label_22:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_22;
            }

            throw v1;
        }

        v0 = this.zadt.getAndSet(v3);
        if(v0 != null) {
            ((zacs)v0).zac(this);
        }

        return v1_1;
    }

    public boolean isCanceled() {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return this.zadv;
        label_6:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_6;
        }

        throw v1;
    }

    @KeepForSdk public final boolean isReady() {
        if(this.zadq.getCount() == 0) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk protected final void setCancelToken(ICancelToken arg2) {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            this.zadx = arg2;
            __monitor_exit(v0);
            return;
        label_6:
            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            goto label_6;
        }

        throw v2;
    }

    @KeepForSdk public final void setResult(Result arg4) {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            if(!this.zadw && !this.zadv) {
                this.isReady();
                Preconditions.checkState(this.isReady() ^ 1, "Results have already been set");
                Preconditions.checkState(this.zadu ^ 1, "Result has already been consumed");
                this.zaa(arg4);
                __monitor_exit(v0);
                return;
            }

            BasePendingResult.zab(arg4);
            __monitor_exit(v0);
            return;
        label_22:
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            goto label_22;
        }

        throw v4;
    }

    @KeepForSdk public final void setResultCallback(ResultCallback arg5) {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        if(arg5 != null) {
            goto label_9;
        }

        arg5 = null;
        try {
            this.zads = arg5;
            __monitor_exit(v0);
            return;
        label_9:
            boolean v2 = true;
            Preconditions.checkState(this.zadu ^ 1, "Result has already been consumed.");
            if(this.zady == null) {
            }
            else {
                v2 = false;
            }

            Preconditions.checkState(v2, "Cannot set callbacks if then() has been called.");
            if(((PendingResult)this).isCanceled()) {
                __monitor_exit(v0);
                return;
            }

            if(this.isReady()) {
                this.zado.zaa(arg5, this.get());
            }
            else {
                this.zads = arg5;
            }

            __monitor_exit(v0);
            return;
        label_33:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_33;
        }

        throw v5;
    }

    @KeepForSdk public final void setResultCallback(ResultCallback arg5, long arg6, TimeUnit arg8) {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        if(arg5 != null) {
            goto label_9;
        }

        arg5 = null;
        try {
            this.zads = arg5;
            __monitor_exit(v0);
            return;
        label_9:
            boolean v2 = true;
            Preconditions.checkState(this.zadu ^ 1, "Result has already been consumed.");
            if(this.zady == null) {
            }
            else {
                v2 = false;
            }

            Preconditions.checkState(v2, "Cannot set callbacks if then() has been called.");
            if(((PendingResult)this).isCanceled()) {
                __monitor_exit(v0);
                return;
            }

            if(this.isReady()) {
                this.zado.zaa(arg5, this.get());
            }
            else {
                this.zads = arg5;
                this.zado.sendMessageDelayed(this.zado.obtainMessage(2, this), arg8.toMillis(arg6));
            }

            __monitor_exit(v0);
            return;
        label_38:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_38;
        }

        throw v5;
    }

    public TransformedResult then(ResultTransform arg6) {
        Preconditions.checkState(this.zadu ^ 1, "Result has already been consumed.");
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            boolean v3 = false;
            boolean v2 = this.zady == null ? true : false;
            Preconditions.checkState(v2, "Cannot call then() twice.");
            if(this.zads == null) {
                v3 = true;
            }

            Preconditions.checkState(v3, "Cannot call then() if callbacks are set.");
            Preconditions.checkState(this.zadv ^ 1, "Cannot call then() if result was canceled.");
            this.zadz = true;
            this.zady = new zacm(this.zadp);
            TransformedResult v6_1 = this.zady.then(arg6);
            if(this.isReady()) {
                this.zado.zaa(this.zady, this.get());
            }
            else {
                this.zads = this.zady;
            }

            __monitor_exit(v0);
            return v6_1;
        label_43:
            __monitor_exit(v0);
        }
        catch(Throwable v6) {
            goto label_43;
        }

        throw v6;
    }

    public final void zaa(zacs arg2) {
        this.zadt.set(arg2);
    }

    static Result zaa(BasePendingResult arg0) {
        return arg0.zaci;
    }

    private final void zaa(Result arg5) {
        this.zaci = arg5;
        ICancelToken v5 = null;
        this.zadx = v5;
        this.zadq.countDown();
        this.mStatus = this.zaci.getStatus();
        if(this.zadv) {
            this.zads = ((ResultCallback)v5);
        }
        else if(this.zads != null) {
            this.zado.removeMessages(2);
            this.zado.zaa(this.zads, this.get());
        }
        else if((this.zaci instanceof Releasable)) {
            this.mResultGuardian = new zaa(this, ((zap)v5));
        }

        ArrayList v5_1 = this.zadr;
        int v0 = v5_1.size();
        int v1 = 0;
        while(v1 < v0) {
            Object v2 = v5_1.get(v1);
            ++v1;
            ((StatusListener)v2).onComplete(this.mStatus);
        }

        this.zadr.clear();
    }

    public final void zab(Status arg3) {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            if(!this.isReady()) {
                this.setResult(this.createFailedResult(arg3));
                this.zadw = true;
            }

            __monitor_exit(v0);
            return;
        label_11:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_11;
        }

        throw v3;
    }

    public static void zab(Result arg4) {
        if((arg4 instanceof Releasable)) {
            try {
                arg4.release();
                return;
            }
            catch(RuntimeException v0) {
                String v4 = String.valueOf(arg4);
                StringBuilder v3 = new StringBuilder(String.valueOf(v4).length() + 18);
                v3.append("Unable to release ");
                v3.append(v4);
                Log.w("BasePendingResult", v3.toString(), ((Throwable)v0));
            }
        }
    }

    public final Integer zam() {
        return null;
    }

    public final boolean zat() {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            if(this.zadp.get() == null || !this.zadz) {
                ((PendingResult)this).cancel();
            }

            __monitor_exit(v0);
            return ((PendingResult)this).isCanceled();
        label_12:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_12;
        }

        throw v1;
    }

    public final void zau() {
        boolean v0 = (this.zadz) || (BasePendingResult.zadm.get().booleanValue()) ? true : false;
        this.zadz = v0;
    }
}

