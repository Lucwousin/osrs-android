package com.google.firebase.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.FirebaseApp$IdTokenListener;
import com.google.firebase.FirebaseApp;

@KeepForSdk @Deprecated public class FirebaseAppHelper {
    public FirebaseAppHelper() {
        super();
    }

    @KeepForSdk public static void addIdTokenListener(FirebaseApp arg0, IdTokenListener arg1) {
        arg0.addIdTokenListener(arg1);
    }

    @KeepForSdk public static Task getToken(FirebaseApp arg0, boolean arg1) {
        return arg0.getToken(arg1);
    }

    @KeepForSdk public static String getUid(FirebaseApp arg0) throws FirebaseApiNotAvailableException {
        return arg0.getUid();
    }

    @KeepForSdk public static void removeIdTokenListener(FirebaseApp arg0, IdTokenListener arg1) {
        arg0.removeIdTokenListener(arg1);
    }
}

