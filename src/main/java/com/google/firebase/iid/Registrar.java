package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

@Keep @KeepForSdk public final class Registrar implements ComponentRegistrar {
    final class zza implements FirebaseInstanceIdInternal {
        private final FirebaseInstanceId zzcr;

        public zza(FirebaseInstanceId arg1) {
            super();
            this.zzcr = arg1;
        }

        public final String getId() {
            return this.zzcr.getId();
        }

        public final String getToken() {
            return this.zzcr.getToken();
        }
    }

    public Registrar() {
        super();
    }

    @Keep public final List getComponents() {
        return Arrays.asList(new Component[]{Component.builder(FirebaseInstanceId.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(Subscriber.class)).add(Dependency.required(UserAgentPublisher.class)).factory(zzao.zzcq).alwaysEager().build(), Component.builder(FirebaseInstanceIdInternal.class).add(Dependency.required(FirebaseInstanceId.class)).factory(zzap.zzcq).build()});
    }
}

