package androidx.core.os;

import android.os.Build$VERSION;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class HandlerCompat {
    private HandlerCompat() {
        super();
    }

    public static boolean postDelayed(@NonNull Handler arg2, @NonNull Runnable arg3, @Nullable Object arg4, long arg5) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg2.postDelayed(arg3, arg4, arg5);
        }

        Message v3 = Message.obtain(arg2, arg3);
        v3.obj = arg4;
        return arg2.sendMessageDelayed(v3, arg5);
    }
}

