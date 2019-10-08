package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;

public interface IGmsServiceBroker extends IInterface {
    public abstract class Stub extends Binder implements IGmsServiceBroker {
        final class zza implements IGmsServiceBroker {
            private final IBinder zza;

            zza(IBinder arg1) {
                super();
                this.zza = arg1;
            }

            public final IBinder asBinder() {
                return this.zza;
            }

            public final void getService(IGmsCallbacks arg4, GetServiceRequest arg5) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    IBinder v4_1 = arg4 != null ? arg4.asBinder() : null;
                    v0.writeStrongBinder(v4_1);
                    if(arg5 != null) {
                        v0.writeInt(1);
                        arg5.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.zza.transact(46, v0, v1, 0);
                    v1.readException();
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                v1.recycle();
                v0.recycle();
            }
        }

        public Stub() {
            super();
            this.attachInterface(((IInterface)this), "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @KeepForSdk public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int arg4, Parcel arg5, Parcel arg6, int arg7) throws RemoteException {
            zzl v7_3;
            if(arg4 > 0xFFFFFF) {
                return super.onTransact(arg4, arg5, arg6, arg7);
            }

            arg5.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder v7 = arg5.readStrongBinder();
            GetServiceRequest v0 = null;
            if(v7 == null) {
                IGmsCallbacks v7_1 = ((IGmsCallbacks)v0);
            }
            else {
                IInterface v1 = v7.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if((v1 instanceof IGmsCallbacks)) {
                    IInterface v7_2 = v1;
                }
                else {
                    v7_3 = new zzl(v7);
                }
            }

            if(arg4 == 46) {
                if(arg5.readInt() != 0) {
                    Object v0_1 = GetServiceRequest.CREATOR.createFromParcel(arg5);
                }

                this.getService(((IGmsCallbacks)v7_3), v0);
                arg6.writeNoException();
                return 1;
            }

            if(arg4 == 0x2F) {
                if(arg5.readInt() != 0) {
                    zzr.CREATOR.createFromParcel(arg5);
                }

                throw new UnsupportedOperationException();
            }

            arg5.readInt();
            if(arg4 != 4) {
                arg5.readString();
            }

            if(arg4 == 23 || arg4 == 25 || arg4 == 27) {
            label_98:
                if(arg5.readInt() == 0) {
                    goto label_102;
                }

                Bundle.CREATOR.createFromParcel(arg5);
            }
            else {
                if(arg4 != 30) {
                    if(arg4 == 34) {
                        goto label_89;
                    }
                    else if(arg4 == 41) {
                        goto label_98;
                    }
                    else if(arg4 != 43) {
                        switch(arg4) {
                            case 1: {
                                goto label_81;
                            }
                            case 2: {
                                goto label_98;
                            }
                        }

                        switch(arg4) {
                            case 9: {
                                goto label_71;
                            }
                            case 10: {
                                goto label_68;
                            }
                            case 5: 
                            case 6: 
                            case 7: 
                            case 8: 
                            case 11: 
                            case 12: 
                            case 13: 
                            case 14: 
                            case 15: 
                            case 16: 
                            case 17: 
                            case 18: {
                                goto label_98;
                            }
                            case 19: {
                                goto label_62;
                            }
                            case 20: {
                                goto label_91;
                            }
                        }

                        switch(arg4) {
                            case 37: 
                            case 38: {
                                goto label_98;
                            }
                            default: {
                                goto label_102;
                            label_68:
                                arg5.readString();
                                arg5.createStringArray();
                                goto label_102;
                            label_71:
                                arg5.readString();
                                arg5.createStringArray();
                                arg5.readString();
                                arg5.readStrongBinder();
                                arg5.readString();
                                if(arg5.readInt() != 0) {
                                    Bundle.CREATOR.createFromParcel(arg5);
                                    goto label_102;
                                label_62:
                                    arg5.readStrongBinder();
                                    if(arg5.readInt() != 0) {
                                        Bundle.CREATOR.createFromParcel(arg5);
                                        goto label_102;
                                    label_81:
                                        arg5.readString();
                                        arg5.createStringArray();
                                        arg5.readString();
                                        if(arg5.readInt() != 0) {
                                            Bundle.CREATOR.createFromParcel(arg5);
                                            goto label_102;
                                        label_89:
                                            arg5.readString();
                                        }
                                        else {
                                        }
                                    }
                                    else {
                                    }
                                }
                                else {
                                }

                                goto label_102;
                            label_91:
                                arg5.createStringArray();
                                arg5.readString();
                                if(arg5.readInt() == 0) {
                                    goto label_102;
                                }

                                Bundle.CREATOR.createFromParcel(arg5);
                                goto label_102;
                            }
                        }
                    }
                    else {
                        goto label_98;
                    }
                }

                goto label_91;
            }

        label_102:
            throw new UnsupportedOperationException();
        }
    }

    @KeepForSdk void getService(IGmsCallbacks arg1, GetServiceRequest arg2) throws RemoteException;
}

