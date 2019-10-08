package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

public interface IObjectWrapper extends IInterface {
    public class Stub extends zzb implements IObjectWrapper {
        public final class zza extends com.google.android.gms.internal.common.zza implements IObjectWrapper {
            zza(IBinder arg2) {
                super(arg2, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static IObjectWrapper asInterface(IBinder arg2) {
            if(arg2 == null) {
                return null;
            }

            IInterface v0 = arg2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if((v0 instanceof IObjectWrapper)) {
                return ((IObjectWrapper)v0);
            }

            return new zza(arg2);
        }
    }

}

