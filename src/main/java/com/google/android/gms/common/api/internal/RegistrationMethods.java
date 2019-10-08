package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk public class RegistrationMethods {
    @KeepForSdk public class Builder {
        private boolean zajv;
        private RemoteCall zaka;
        private RemoteCall zakb;
        private ListenerHolder zakc;
        private Feature[] zakd;

        Builder(zabx arg1) {
            this();
        }

        private Builder() {
            super();
            this.zajv = true;
        }

        @KeepForSdk public RegistrationMethods build() {
            boolean v1 = false;
            boolean v0 = this.zaka != null ? true : false;
            Preconditions.checkArgument(v0, "Must set register function");
            v0 = this.zakb != null ? true : false;
            Preconditions.checkArgument(v0, "Must set unregister function");
            if(this.zakc != null) {
                v1 = true;
            }

            Preconditions.checkArgument(v1, "Must set holder");
            return new RegistrationMethods(new zaca(this, this.zakc, this.zakd, this.zajv), new zacb(this, this.zakc.getListenerKey()), null);
        }

        @KeepForSdk public Builder register(RemoteCall arg1) {
            this.zaka = arg1;
            return this;
        }

        @KeepForSdk @Deprecated public Builder register(BiConsumer arg2) {
            this.zaka = new zaby(arg2);
            return this;
        }

        @KeepForSdk public Builder setAutoResolveMissingFeatures(boolean arg1) {
            this.zajv = arg1;
            return this;
        }

        @KeepForSdk public Builder setFeatures(Feature[] arg1) {
            this.zakd = arg1;
            return this;
        }

        @KeepForSdk public Builder unregister(RemoteCall arg1) {
            this.zakb = arg1;
            return this;
        }

        @KeepForSdk @Deprecated public Builder unregister(BiConsumer arg1) {
            this.zaka = new zabz(this);
            return this;
        }

        @KeepForSdk public Builder withHolder(ListenerHolder arg1) {
            this.zakc = arg1;
            return this;
        }

        static RemoteCall zaa(Builder arg0) {
            return arg0.zaka;
        }

        final void zaa(AnyClient arg2, TaskCompletionSource arg3) throws RemoteException {
            this.zaka.accept(arg2, arg3);
        }

        static RemoteCall zab(Builder arg0) {
            return arg0.zakb;
        }
    }

    public final RegisterListenerMethod zajy;
    public final UnregisterListenerMethod zajz;

    private RegistrationMethods(RegisterListenerMethod arg1, UnregisterListenerMethod arg2) {
        super();
        this.zajy = arg1;
        this.zajz = arg2;
    }

    RegistrationMethods(RegisterListenerMethod arg1, UnregisterListenerMethod arg2, zabx arg3) {
        this(arg1, arg2);
    }

    @KeepForSdk public static Builder builder() {
        return new Builder(null);
    }
}

