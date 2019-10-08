package androidx.transition;

import android.os.IBinder;

class WindowIdApi14 implements WindowIdImpl {
    private final IBinder mToken;

    WindowIdApi14(IBinder arg1) {
        super();
        this.mToken = arg1;
    }

    public boolean equals(Object arg2) {
        boolean v2 = !(arg2 instanceof WindowIdApi14) || !((WindowIdApi14)arg2).mToken.equals(this.mToken) ? false : true;
        return v2;
    }

    public int hashCode() {
        return this.mToken.hashCode();
    }
}

