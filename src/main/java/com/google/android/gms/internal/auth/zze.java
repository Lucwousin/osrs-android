package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public interface zze extends IInterface {
    Bundle zza(Account arg1) throws RemoteException;

    Bundle zza(Account arg1, String arg2, Bundle arg3) throws RemoteException;

    Bundle zza(String arg1) throws RemoteException;

    Bundle zza(String arg1, Bundle arg2) throws RemoteException;

    AccountChangeEventsResponse zza(AccountChangeEventsRequest arg1) throws RemoteException;
}

