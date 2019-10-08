package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk public abstract class TaskApiCall {
    @KeepForSdk public class Builder {
        private Feature[] zakd;
        private boolean zakk;
        private RemoteCall zakl;

        Builder(zaci arg1) {
            this();
        }

        private Builder() {
            super();
            this.zakk = true;
        }

        @KeepForSdk public TaskApiCall build() {
            boolean v0 = this.zakl != null ? true : false;
            Preconditions.checkArgument(v0, "execute parameter required");
            return new zack(this, this.zakd, this.zakk);
        }

        @KeepForSdk @Deprecated public Builder execute(BiConsumer arg2) {
            this.zakl = new zacj(arg2);
            return this;
        }

        @KeepForSdk public Builder run(RemoteCall arg1) {
            this.zakl = arg1;
            return this;
        }

        @KeepForSdk public Builder setAutoResolveMissingFeatures(boolean arg1) {
            this.zakk = arg1;
            return this;
        }

        @KeepForSdk public Builder setFeatures(Feature[] arg1) {
            this.zakd = arg1;
            return this;
        }

        static RemoteCall zaa(Builder arg0) {
            return arg0.zakl;
        }
    }

    private final Feature[] zakd;
    private final boolean zakk;

    @KeepForSdk @Deprecated public TaskApiCall() {
        super();
        this.zakd = null;
        this.zakk = false;
    }

    @KeepForSdk private TaskApiCall(Feature[] arg1, boolean arg2) {
        super();
        this.zakd = arg1;
        this.zakk = arg2;
    }

    TaskApiCall(Feature[] arg1, boolean arg2, zaci arg3) {
        this(arg1, arg2);
    }

    @KeepForSdk public static Builder builder() {
        return new Builder(null);
    }

    @KeepForSdk protected abstract void doExecute(AnyClient arg1, TaskCompletionSource arg2) throws RemoteException;

    @KeepForSdk public boolean shouldAutoResolveMissingFeatures() {
        return this.zakk;
    }

    @Nullable public final Feature[] zabt() {
        return this.zakd;
    }
}

