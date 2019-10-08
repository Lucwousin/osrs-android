package android.support.v4.media;

import androidx.annotation.RequiresApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RequiresApi(value=21) class ParceledListSliceAdapterApi21 {
    private static Constructor sConstructor;

    static {
        try {
            ParceledListSliceAdapterApi21.sConstructor = Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class);
        }
        catch(NoSuchMethodException v0) {
            ((ReflectiveOperationException)v0).printStackTrace();
        }
    }

    private ParceledListSliceAdapterApi21() {
        super();
    }

    static Object newInstance(List arg3) {
        Object v3_1;
        try {
            v3_1 = ParceledListSliceAdapterApi21.sConstructor.newInstance(arg3);
        }
        catch(InvocationTargetException v3) {
            ((ReflectiveOperationException)v3).printStackTrace();
            v3_1 = null;
        }

        return v3_1;
    }
}

