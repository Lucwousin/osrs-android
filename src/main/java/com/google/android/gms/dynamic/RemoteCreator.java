package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk public abstract class RemoteCreator {
    @KeepForSdk public class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String arg1, Throwable arg2) {
            super(arg1, arg2);
        }

        public RemoteCreatorException(String arg1) {
            super(arg1);
        }
    }

    private final String zzia;
    private Object zzib;

    @KeepForSdk protected RemoteCreator(String arg1) {
        super();
        this.zzia = arg1;
    }

    @KeepForSdk protected abstract Object getRemoteCreator(IBinder arg1);

    @KeepForSdk protected final Object getRemoteCreatorInstance(Context arg3) throws RemoteCreatorException {
        if(this.zzib == null) {
            Preconditions.checkNotNull(arg3);
            arg3 = GooglePlayServicesUtilLight.getRemoteContext(arg3);
            if(arg3 != null) {
                ClassLoader v3 = arg3.getClassLoader();
                try {
                    this.zzib = this.getRemoteCreator(v3.loadClass(this.zzia).newInstance());
                }
                catch(IllegalAccessException v3_1) {
                    throw new RemoteCreatorException("Could not access creator.", ((Throwable)v3_1));
                }
                catch(InstantiationException v3_2) {
                    throw new RemoteCreatorException("Could not instantiate creator.", ((Throwable)v3_2));
                }
                catch(ClassNotFoundException v3_3) {
                    throw new RemoteCreatorException("Could not load creator class.", ((Throwable)v3_3));
                }
            }
            else {
                throw new RemoteCreatorException("Could not get remote context.");
            }
        }

        return this.zzib;
    }
}

