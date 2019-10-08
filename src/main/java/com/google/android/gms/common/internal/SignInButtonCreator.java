package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;
import com.google.android.gms.dynamic.RemoteCreator;

public final class SignInButtonCreator extends RemoteCreator {
    private static final SignInButtonCreator zape;

    static {
        SignInButtonCreator.zape = new SignInButtonCreator();
    }

    private SignInButtonCreator() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View createView(Context arg1, int arg2, int arg3) throws RemoteCreatorException {
        return SignInButtonCreator.zape.zaa(arg1, arg2, arg3);
    }

    public final ISignInButtonCreator getRemoteCreator(IBinder arg3) {
        if(arg3 == null) {
            return null;
        }

        IInterface v0 = arg3.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if((v0 instanceof ISignInButtonCreator)) {
            return ((ISignInButtonCreator)v0);
        }

        return new zah(arg3);
    }

    public final Object getRemoteCreator(IBinder arg1) {
        return this.getRemoteCreator(arg1);
    }

    private final View zaa(Context arg4, int arg5, int arg6) throws RemoteCreatorException {
        try {
            return ObjectWrapper.unwrap(this.getRemoteCreatorInstance(arg4).newSignInButtonFromConfig(ObjectWrapper.wrap(arg4), new SignInButtonConfig(arg5, arg6, null)));
        }
        catch(Exception v4) {
            StringBuilder v2 = new StringBuilder(0x40);
            v2.append("Could not get button with size ");
            v2.append(arg5);
            v2.append(" and color ");
            v2.append(arg6);
            throw new RemoteCreatorException(v2.toString(), ((Throwable)v4));
        }
    }
}

