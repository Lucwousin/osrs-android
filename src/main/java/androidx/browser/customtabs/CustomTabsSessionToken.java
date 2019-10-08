package androidx.browser.customtabs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback$Stub;
import android.support.customtabs.ICustomTabsCallback;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.BundleCompat;

public class CustomTabsSessionToken {
    class MockCallback extends Stub {
        MockCallback() {
            super();
        }

        public IBinder asBinder() {
            return this;
        }

        public void extraCallback(String arg1, Bundle arg2) {
        }

        public void onMessageChannelReady(Bundle arg1) {
        }

        public void onNavigationEvent(int arg1, Bundle arg2) {
        }

        public void onPostMessage(String arg1, Bundle arg2) {
        }

        public void onRelationshipValidationResult(int arg1, Uri arg2, boolean arg3, Bundle arg4) {
        }
    }

    private static final String TAG = "CustomTabsSessionToken";
    private final CustomTabsCallback mCallback;
    final ICustomTabsCallback mCallbackBinder;

    CustomTabsSessionToken(ICustomTabsCallback arg1) {
        super();
        this.mCallbackBinder = arg1;
        this.mCallback = new CustomTabsCallback() {
            public void extraCallback(String arg2, Bundle arg3) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.extraCallback(arg2, arg3);
                }
                catch(RemoteException ) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public void onMessageChannelReady(Bundle arg2) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onMessageChannelReady(arg2);
                }
                catch(RemoteException ) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public void onNavigationEvent(int arg2, Bundle arg3) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onNavigationEvent(arg2, arg3);
                }
                catch(RemoteException ) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public void onPostMessage(String arg2, Bundle arg3) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onPostMessage(arg2, arg3);
                }
                catch(RemoteException ) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }

            public void onRelationshipValidationResult(int arg2, Uri arg3, boolean arg4, Bundle arg5) {
                try {
                    CustomTabsSessionToken.this.mCallbackBinder.onRelationshipValidationResult(arg2, arg3, arg4, arg5);
                }
                catch(RemoteException ) {
                    Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                }
            }
        };
    }

    @NonNull public static CustomTabsSessionToken createMockSessionTokenForTesting() {
        return new CustomTabsSessionToken(new MockCallback());
    }

    public boolean equals(Object arg2) {
        if(!(arg2 instanceof CustomTabsSessionToken)) {
            return 0;
        }

        return ((CustomTabsSessionToken)arg2).getCallbackBinder().equals(this.mCallbackBinder.asBinder());
    }

    public CustomTabsCallback getCallback() {
        return this.mCallback;
    }

    IBinder getCallbackBinder() {
        return this.mCallbackBinder.asBinder();
    }

    public static CustomTabsSessionToken getSessionTokenFromIntent(Intent arg1) {
        IBinder v1 = BundleCompat.getBinder(arg1.getExtras(), "android.support.customtabs.extra.SESSION");
        if(v1 == null) {
            return null;
        }

        return new CustomTabsSessionToken(Stub.asInterface(v1));
    }

    public int hashCode() {
        return this.getCallbackBinder().hashCode();
    }

    public boolean isAssociatedWith(CustomTabsSession arg2) {
        return arg2.getBinder().equals(this.mCallbackBinder);
    }
}

