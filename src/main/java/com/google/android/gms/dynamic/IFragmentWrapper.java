package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IFragmentWrapper extends IInterface {
    public abstract class Stub extends zzb implements IFragmentWrapper {
        public final class zza extends com.google.android.gms.internal.common.zza implements IFragmentWrapper {
            zza(IBinder arg2) {
                super(arg2, "com.google.android.gms.dynamic.IFragmentWrapper");
            }

            public final Bundle getArguments() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(3, ((com.google.android.gms.internal.common.zza)this).zza());
                Parcelable v1 = zzc.zza(v0, Bundle.CREATOR);
                v0.recycle();
                return ((Bundle)v1);
            }

            public final int getId() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(4, ((com.google.android.gms.internal.common.zza)this).zza());
                int v1 = v0.readInt();
                v0.recycle();
                return v1;
            }

            public final boolean getRetainInstance() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(7, ((com.google.android.gms.internal.common.zza)this).zza());
                boolean v1 = zzc.zza(v0);
                v0.recycle();
                return v1;
            }

            public final String getTag() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(8, ((com.google.android.gms.internal.common.zza)this).zza());
                String v1 = v0.readString();
                v0.recycle();
                return v1;
            }

            public final int getTargetRequestCode() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(10, ((com.google.android.gms.internal.common.zza)this).zza());
                int v1 = v0.readInt();
                v0.recycle();
                return v1;
            }

            public final boolean getUserVisibleHint() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(11, ((com.google.android.gms.internal.common.zza)this).zza());
                boolean v1 = zzc.zza(v0);
                v0.recycle();
                return v1;
            }

            public final boolean isAdded() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(13, ((com.google.android.gms.internal.common.zza)this).zza());
                boolean v1 = zzc.zza(v0);
                v0.recycle();
                return v1;
            }

            public final boolean isDetached() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(14, ((com.google.android.gms.internal.common.zza)this).zza());
                boolean v1 = zzc.zza(v0);
                v0.recycle();
                return v1;
            }

            public final boolean isHidden() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(15, ((com.google.android.gms.internal.common.zza)this).zza());
                boolean v1 = zzc.zza(v0);
                v0.recycle();
                return v1;
            }

            public final boolean isInLayout() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(16, ((com.google.android.gms.internal.common.zza)this).zza());
                boolean v1 = zzc.zza(v0);
                v0.recycle();
                return v1;
            }

            public final boolean isRemoving() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(17, ((com.google.android.gms.internal.common.zza)this).zza());
                boolean v1 = zzc.zza(v0);
                v0.recycle();
                return v1;
            }

            public final boolean isResumed() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(18, ((com.google.android.gms.internal.common.zza)this).zza());
                boolean v1 = zzc.zza(v0);
                v0.recycle();
                return v1;
            }

            public final boolean isVisible() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(19, ((com.google.android.gms.internal.common.zza)this).zza());
                boolean v1 = zzc.zza(v0);
                v0.recycle();
                return v1;
            }

            public final void setHasOptionsMenu(boolean arg2) throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza();
                zzc.writeBoolean(v0, arg2);
                ((com.google.android.gms.internal.common.zza)this).zzb(21, v0);
            }

            public final void setMenuVisibility(boolean arg2) throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza();
                zzc.writeBoolean(v0, arg2);
                ((com.google.android.gms.internal.common.zza)this).zzb(22, v0);
            }

            public final void setRetainInstance(boolean arg2) throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza();
                zzc.writeBoolean(v0, arg2);
                ((com.google.android.gms.internal.common.zza)this).zzb(23, v0);
            }

            public final void setUserVisibleHint(boolean arg2) throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza();
                zzc.writeBoolean(v0, arg2);
                ((com.google.android.gms.internal.common.zza)this).zzb(24, v0);
            }

            public final void startActivity(Intent arg2) throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza();
                zzc.zza(v0, ((Parcelable)arg2));
                ((com.google.android.gms.internal.common.zza)this).zzb(25, v0);
            }

            public final void startActivityForResult(Intent arg2, int arg3) throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza();
                zzc.zza(v0, ((Parcelable)arg2));
                v0.writeInt(arg3);
                ((com.google.android.gms.internal.common.zza)this).zzb(26, v0);
            }

            public final void zza(IObjectWrapper arg2) throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza();
                zzc.zza(v0, ((IInterface)arg2));
                ((com.google.android.gms.internal.common.zza)this).zzb(20, v0);
            }

            public final IObjectWrapper zzad() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(2, ((com.google.android.gms.internal.common.zza)this).zza());
                IObjectWrapper v1 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(v0.readStrongBinder());
                v0.recycle();
                return v1;
            }

            public final IFragmentWrapper zzae() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(5, ((com.google.android.gms.internal.common.zza)this).zza());
                IFragmentWrapper v1 = Stub.asInterface(v0.readStrongBinder());
                v0.recycle();
                return v1;
            }

            public final IObjectWrapper zzaf() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(6, ((com.google.android.gms.internal.common.zza)this).zza());
                IObjectWrapper v1 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(v0.readStrongBinder());
                v0.recycle();
                return v1;
            }

            public final IFragmentWrapper zzag() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(9, ((com.google.android.gms.internal.common.zza)this).zza());
                IFragmentWrapper v1 = Stub.asInterface(v0.readStrongBinder());
                v0.recycle();
                return v1;
            }

            public final IObjectWrapper zzah() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(12, ((com.google.android.gms.internal.common.zza)this).zza());
                IObjectWrapper v1 = com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(v0.readStrongBinder());
                v0.recycle();
                return v1;
            }

            public final void zzb(IObjectWrapper arg2) throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza();
                zzc.zza(v0, ((IInterface)arg2));
                ((com.google.android.gms.internal.common.zza)this).zzb(27, v0);
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder arg2) {
            if(arg2 == null) {
                return null;
            }

            IInterface v0 = arg2.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if((v0 instanceof IFragmentWrapper)) {
                return ((IFragmentWrapper)v0);
            }

            return new zza(arg2);
        }

        protected final boolean zza(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException {
            switch(arg1) {
                case 2: {
                    goto label_108;
                }
                case 3: {
                    goto label_104;
                }
                case 4: {
                    goto label_100;
                }
                case 5: {
                    goto label_96;
                }
                case 6: {
                    goto label_92;
                }
                case 7: {
                    goto label_88;
                }
                case 8: {
                    goto label_84;
                }
                case 9: {
                    goto label_80;
                }
                case 10: {
                    goto label_76;
                }
                case 11: {
                    goto label_72;
                }
                case 12: {
                    goto label_68;
                }
                case 13: {
                    goto label_64;
                }
                case 14: {
                    goto label_60;
                }
                case 15: {
                    goto label_56;
                }
                case 16: {
                    goto label_52;
                }
                case 17: {
                    goto label_48;
                }
                case 18: {
                    goto label_44;
                }
                case 19: {
                    goto label_40;
                }
                case 20: {
                    goto label_35;
                }
                case 21: {
                    goto label_31;
                }
                case 22: {
                    goto label_27;
                }
                case 23: {
                    goto label_23;
                }
                case 24: {
                    goto label_19;
                }
                case 25: {
                    goto label_14;
                }
                case 26: {
                    goto label_8;
                }
                case 27: {
                    goto label_3;
                }
            }

            return 0;
        label_35:
            this.zza(com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(arg2.readStrongBinder()));
            arg3.writeNoException();
            return 1;
        label_100:
            arg1 = this.getId();
            arg3.writeNoException();
            arg3.writeInt(arg1);
            return 1;
        label_104:
            Bundle v1 = this.getArguments();
            arg3.writeNoException();
            zzc.zzb(arg3, ((Parcelable)v1));
            return 1;
        label_40:
            boolean v1_1 = this.isVisible();
            arg3.writeNoException();
            zzc.writeBoolean(arg3, v1_1);
            return 1;
        label_108:
            IObjectWrapper v1_2 = this.zzad();
            arg3.writeNoException();
            zzc.zza(arg3, ((IInterface)v1_2));
            return 1;
        label_44:
            v1_1 = this.isResumed();
            arg3.writeNoException();
            zzc.writeBoolean(arg3, v1_1);
            return 1;
        label_48:
            v1_1 = this.isRemoving();
            arg3.writeNoException();
            zzc.writeBoolean(arg3, v1_1);
            return 1;
        label_52:
            v1_1 = this.isInLayout();
            arg3.writeNoException();
            zzc.writeBoolean(arg3, v1_1);
            return 1;
        label_56:
            v1_1 = this.isHidden();
            arg3.writeNoException();
            zzc.writeBoolean(arg3, v1_1);
            return 1;
        label_60:
            v1_1 = this.isDetached();
            arg3.writeNoException();
            zzc.writeBoolean(arg3, v1_1);
            return 1;
        label_64:
            v1_1 = this.isAdded();
            arg3.writeNoException();
            zzc.writeBoolean(arg3, v1_1);
            return 1;
        label_3:
            this.zzb(com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(arg2.readStrongBinder()));
            arg3.writeNoException();
            return 1;
        label_68:
            v1_2 = this.zzah();
            arg3.writeNoException();
            zzc.zza(arg3, ((IInterface)v1_2));
            return 1;
        label_72:
            v1_1 = this.getUserVisibleHint();
            arg3.writeNoException();
            zzc.writeBoolean(arg3, v1_1);
            return 1;
        label_8:
            this.startActivityForResult(zzc.zza(arg2, Intent.CREATOR), arg2.readInt());
            arg3.writeNoException();
            return 1;
        label_76:
            arg1 = this.getTargetRequestCode();
            arg3.writeNoException();
            arg3.writeInt(arg1);
            return 1;
        label_14:
            this.startActivity(zzc.zza(arg2, Intent.CREATOR));
            arg3.writeNoException();
            return 1;
        label_80:
            IFragmentWrapper v1_3 = this.zzag();
            arg3.writeNoException();
            zzc.zza(arg3, ((IInterface)v1_3));
            return 1;
        label_19:
            this.setUserVisibleHint(zzc.zza(arg2));
            arg3.writeNoException();
            return 1;
        label_84:
            String v1_4 = this.getTag();
            arg3.writeNoException();
            arg3.writeString(v1_4);
            return 1;
        label_23:
            this.setRetainInstance(zzc.zza(arg2));
            arg3.writeNoException();
            return 1;
        label_88:
            v1_1 = this.getRetainInstance();
            arg3.writeNoException();
            zzc.writeBoolean(arg3, v1_1);
            return 1;
        label_27:
            this.setMenuVisibility(zzc.zza(arg2));
            arg3.writeNoException();
            return 1;
        label_92:
            v1_2 = this.zzaf();
            arg3.writeNoException();
            zzc.zza(arg3, ((IInterface)v1_2));
            return 1;
        label_31:
            this.setHasOptionsMenu(zzc.zza(arg2));
            arg3.writeNoException();
            return 1;
        label_96:
            v1_3 = this.zzae();
            arg3.writeNoException();
            zzc.zza(arg3, ((IInterface)v1_3));
            return 1;
        }
    }

    Bundle getArguments() throws RemoteException;

    int getId() throws RemoteException;

    boolean getRetainInstance() throws RemoteException;

    String getTag() throws RemoteException;

    int getTargetRequestCode() throws RemoteException;

    boolean getUserVisibleHint() throws RemoteException;

    boolean isAdded() throws RemoteException;

    boolean isDetached() throws RemoteException;

    boolean isHidden() throws RemoteException;

    boolean isInLayout() throws RemoteException;

    boolean isRemoving() throws RemoteException;

    boolean isResumed() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void setHasOptionsMenu(boolean arg1) throws RemoteException;

    void setMenuVisibility(boolean arg1) throws RemoteException;

    void setRetainInstance(boolean arg1) throws RemoteException;

    void setUserVisibleHint(boolean arg1) throws RemoteException;

    void startActivity(Intent arg1) throws RemoteException;

    void startActivityForResult(Intent arg1, int arg2) throws RemoteException;

    void zza(IObjectWrapper arg1) throws RemoteException;

    IObjectWrapper zzad() throws RemoteException;

    IFragmentWrapper zzae() throws RemoteException;

    IObjectWrapper zzaf() throws RemoteException;

    IFragmentWrapper zzag() throws RemoteException;

    IObjectWrapper zzah() throws RemoteException;

    void zzb(IObjectWrapper arg1) throws RemoteException;
}

