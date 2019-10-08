package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zal;

@KeepForSdk public final class ListenerHolder {
    @KeepForSdk public final class ListenerKey {
        private final Object zajj;
        private final String zajm;

        @KeepForSdk ListenerKey(Object arg1, String arg2) {
            super();
            this.zajj = arg1;
            this.zajm = arg2;
        }

        public final boolean equals(Object arg5) {
            if(this == (((ListenerKey)arg5))) {
                return 1;
            }

            if(!(arg5 instanceof ListenerKey)) {
                return 0;
            }

            if(this.zajj == ((ListenerKey)arg5).zajj && (this.zajm.equals(((ListenerKey)arg5).zajm))) {
                return 1;
            }

            return 0;
        }

        public final int hashCode() {
            return System.identityHashCode(this.zajj) * 0x1F + this.zajm.hashCode();
        }
    }

    @KeepForSdk public interface Notifier {
        @KeepForSdk void notifyListener(Object arg1);

        @KeepForSdk void onNotifyListenerFailed();
    }

    final class zaa extends zal {
        public zaa(ListenerHolder arg1, Looper arg2) {
            this.zajl = arg1;
            super(arg2);
        }

        public final void handleMessage(Message arg3) {
            boolean v1 = true;
            if(arg3.what == 1) {
            }
            else {
                v1 = false;
            }

            Preconditions.checkArgument(v1);
            this.zajl.notifyListenerInternal(arg3.obj);
        }
    }

    private final zaa zaji;
    private volatile Object zajj;
    private final ListenerKey zajk;

    @KeepForSdk ListenerHolder(@NonNull Looper arg2, @NonNull Object arg3, @NonNull String arg4) {
        super();
        this.zaji = new zaa(this, arg2);
        this.zajj = Preconditions.checkNotNull(arg3, "Listener must not be null");
        this.zajk = new ListenerKey(arg3, Preconditions.checkNotEmpty(arg4));
    }

    @KeepForSdk public final void clear() {
        this.zajj = null;
    }

    @NonNull @KeepForSdk public final ListenerKey getListenerKey() {
        return this.zajk;
    }

    @KeepForSdk public final boolean hasListener() {
        if(this.zajj != null) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public final void notifyListener(Notifier arg3) {
        Preconditions.checkNotNull(arg3, "Notifier must not be null");
        this.zaji.sendMessage(this.zaji.obtainMessage(1, arg3));
    }

    @KeepForSdk final void notifyListenerInternal(Notifier arg2) {
        Object v0 = this.zajj;
        if(v0 == null) {
            arg2.onNotifyListenerFailed();
            return;
        }

        try {
            arg2.notifyListener(v0);
            return;
        }
        catch(RuntimeException v0_1) {
            arg2.onNotifyListenerFailed();
            throw v0_1;
        }
    }
}

