package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class zze extends zzj {
    private int zzt;

    protected zze(byte[] arg3) {
        super();
        boolean v0 = arg3.length == 25 ? true : false;
        Preconditions.checkArgument(v0);
        this.zzt = Arrays.hashCode(arg3);
    }

    public boolean equals(Object arg4) {
        if(arg4 != null) {
            if(!(arg4 instanceof zzi)) {
            }
            else {
                try {
                    if(((zzi)arg4).zzc() != this.hashCode()) {
                        return 0;
                    }
                    else {
                        IObjectWrapper v4_1 = ((zzi)arg4).zzb();
                        if(v4_1 == null) {
                            return 0;
                        }
                        else {
                            return Arrays.equals(this.getBytes(), ObjectWrapper.unwrap(v4_1));
                        }
                    }
                }
                catch(RemoteException v4) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", ((Throwable)v4));
                    return 0;
                }
            }
        }

        return 0;
    }

    abstract byte[] getBytes();

    public int hashCode() {
        return this.zzt;
    }

    protected static byte[] zza(String arg1) {
        try {
            return arg1.getBytes("ISO-8859-1");
        }
        catch(UnsupportedEncodingException v1) {
            throw new AssertionError(v1);
        }
    }

    public final IObjectWrapper zzb() {
        return ObjectWrapper.wrap(this.getBytes());
    }

    public final int zzc() {
        return this.hashCode();
    }
}

