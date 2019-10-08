package com.google.firebase.iid;

import android.os.Build$VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

public class zzl implements Parcelable {
    public final class zza extends ClassLoader {
        public zza() {
            super();
        }

        protected final Class loadClass(String arg2, boolean arg3) throws ClassNotFoundException {
            if("com.google.android.gms.iid.MessengerCompat".equals(arg2)) {
                if(FirebaseInstanceId.zzm()) {
                    Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
                }

                return zzl.class;
            }

            return super.loadClass(arg2, arg3);
        }
    }

    public static final Parcelable$Creator CREATOR;
    private Messenger zzal;
    private zzv zzam;

    static {
        zzl.CREATOR = new zzm();
    }

    public zzl(IBinder arg3) {
        super();
        if(Build$VERSION.SDK_INT >= 21) {
            this.zzal = new Messenger(arg3);
            return;
        }

        this.zzam = new zzw(arg3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object arg3) {
        if(arg3 == null) {
            return 0;
        }

        try {
            return this.getBinder().equals(((zzl)arg3).getBinder());
        }
        catch(ClassCastException ) {
            return 0;
        }
    }

    private final IBinder getBinder() {
        if(this.zzal != null) {
            return this.zzal.getBinder();
        }

        return this.zzam.asBinder();
    }

    public int hashCode() {
        return this.getBinder().hashCode();
    }

    public final void send(Message arg2) throws RemoteException {
        if(this.zzal != null) {
            this.zzal.send(arg2);
            return;
        }

        this.zzam.send(arg2);
    }

    public void writeToParcel(Parcel arg1, int arg2) {
        if(this.zzal != null) {
            arg1.writeStrongBinder(this.zzal.getBinder());
            return;
        }

        arg1.writeStrongBinder(this.zzam.asBinder());
    }
}

