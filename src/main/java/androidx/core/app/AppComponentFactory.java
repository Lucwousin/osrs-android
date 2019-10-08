package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(value=28) public class AppComponentFactory extends android.app.AppComponentFactory {
    public AppComponentFactory() {
        super();
    }

    public final Activity instantiateActivity(ClassLoader arg1, String arg2, Intent arg3) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.checkCompatWrapper(this.instantiateActivityCompat(arg1, arg2, arg3));
    }

    @NonNull public Activity instantiateActivityCompat(@NonNull ClassLoader arg1, @NonNull String arg2, @Nullable Intent arg3) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return arg1.loadClass(arg2).getDeclaredConstructor().newInstance();
        }
        catch(NoSuchMethodException v1) {
            throw new RuntimeException("Couldn\'t call constructor", ((Throwable)v1));
        }
    }

    public final Application instantiateApplication(ClassLoader arg1, String arg2) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.checkCompatWrapper(this.instantiateApplicationCompat(arg1, arg2));
    }

    @NonNull public Application instantiateApplicationCompat(@NonNull ClassLoader arg2, @NonNull String arg3) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return arg2.loadClass(arg3).getDeclaredConstructor().newInstance();
        }
        catch(NoSuchMethodException v2) {
            throw new RuntimeException("Couldn\'t call constructor", ((Throwable)v2));
        }
    }

    public final ContentProvider instantiateProvider(ClassLoader arg1, String arg2) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.checkCompatWrapper(this.instantiateProviderCompat(arg1, arg2));
    }

    @NonNull public ContentProvider instantiateProviderCompat(@NonNull ClassLoader arg2, @NonNull String arg3) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return arg2.loadClass(arg3).getDeclaredConstructor().newInstance();
        }
        catch(NoSuchMethodException v2) {
            throw new RuntimeException("Couldn\'t call constructor", ((Throwable)v2));
        }
    }

    public final BroadcastReceiver instantiateReceiver(ClassLoader arg1, String arg2, Intent arg3) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.checkCompatWrapper(this.instantiateReceiverCompat(arg1, arg2, arg3));
    }

    @NonNull public BroadcastReceiver instantiateReceiverCompat(@NonNull ClassLoader arg1, @NonNull String arg2, @Nullable Intent arg3) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return arg1.loadClass(arg2).getDeclaredConstructor().newInstance();
        }
        catch(NoSuchMethodException v1) {
            throw new RuntimeException("Couldn\'t call constructor", ((Throwable)v1));
        }
    }

    public final Service instantiateService(ClassLoader arg1, String arg2, Intent arg3) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return CoreComponentFactory.checkCompatWrapper(this.instantiateServiceCompat(arg1, arg2, arg3));
    }

    @NonNull public Service instantiateServiceCompat(@NonNull ClassLoader arg1, @NonNull String arg2, @Nullable Intent arg3) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        try {
            return arg1.loadClass(arg2).getDeclaredConstructor().newInstance();
        }
        catch(NoSuchMethodException v1) {
            throw new RuntimeException("Couldn\'t call constructor", ((Throwable)v1));
        }
    }
}

