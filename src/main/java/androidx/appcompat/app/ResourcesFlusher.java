package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build$VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.util.Map;

class ResourcesFlusher {
    private static final String TAG = "ResourcesFlusher";
    private static Field sDrawableCacheField;
    private static boolean sDrawableCacheFieldFetched;
    private static Field sResourcesImplField;
    private static boolean sResourcesImplFieldFetched;
    private static Class sThemedResourceCacheClazz;
    private static boolean sThemedResourceCacheClazzFetched;
    private static Field sThemedResourceCache_mUnthemedEntriesField;
    private static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;

    private ResourcesFlusher() {
        super();
    }

    static void flush(@NonNull Resources arg2) {
        if(Build$VERSION.SDK_INT >= 28) {
            return;
        }

        if(Build$VERSION.SDK_INT >= 24) {
            ResourcesFlusher.flushNougats(arg2);
        }
        else if(Build$VERSION.SDK_INT >= 23) {
            ResourcesFlusher.flushMarshmallows(arg2);
        }
        else if(Build$VERSION.SDK_INT >= 21) {
            ResourcesFlusher.flushLollipops(arg2);
        }
    }

    @RequiresApi(value=21) private static void flushLollipops(@NonNull Resources arg4) {
        Object v4_1;
        if(!ResourcesFlusher.sDrawableCacheFieldFetched) {
            try {
                ResourcesFlusher.sDrawableCacheField = Resources.class.getDeclaredField("mDrawableCache");
                ResourcesFlusher.sDrawableCacheField.setAccessible(true);
            }
            catch(NoSuchFieldException v1) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", ((Throwable)v1));
            }

            ResourcesFlusher.sDrawableCacheFieldFetched = true;
        }

        if(ResourcesFlusher.sDrawableCacheField != null) {
            Object v0 = null;
            try {
                v4_1 = ResourcesFlusher.sDrawableCacheField.get(arg4);
            }
            catch(IllegalAccessException v4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", ((Throwable)v4));
                v4_1 = v0;
            }

            if(v4_1 == null) {
                return;
            }

            ((Map)v4_1).clear();
        }
    }

    @RequiresApi(value=23) private static void flushMarshmallows(@NonNull Resources arg4) {
        Object v4_1;
        if(!ResourcesFlusher.sDrawableCacheFieldFetched) {
            try {
                ResourcesFlusher.sDrawableCacheField = Resources.class.getDeclaredField("mDrawableCache");
                ResourcesFlusher.sDrawableCacheField.setAccessible(true);
            }
            catch(NoSuchFieldException v1) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", ((Throwable)v1));
            }

            ResourcesFlusher.sDrawableCacheFieldFetched = true;
        }

        Object v0 = null;
        if(ResourcesFlusher.sDrawableCacheField != null) {
            try {
                v4_1 = ResourcesFlusher.sDrawableCacheField.get(arg4);
                goto label_26;
            }
            catch(IllegalAccessException v4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", ((Throwable)v4));
            }
        }

        v4_1 = v0;
    label_26:
        if(v4_1 == null) {
            return;
        }

        ResourcesFlusher.flushThemedResourcesCache(v4_1);
    }

    @RequiresApi(value=24) private static void flushNougats(@NonNull Resources arg5) {
        Object v5_1;
        if(!ResourcesFlusher.sResourcesImplFieldFetched) {
            try {
                ResourcesFlusher.sResourcesImplField = Resources.class.getDeclaredField("mResourcesImpl");
                ResourcesFlusher.sResourcesImplField.setAccessible(true);
            }
            catch(NoSuchFieldException v0) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", ((Throwable)v0));
            }

            ResourcesFlusher.sResourcesImplFieldFetched = true;
        }

        if(ResourcesFlusher.sResourcesImplField == null) {
            return;
        }

        Object v0_1 = null;
        try {
            v5_1 = ResourcesFlusher.sResourcesImplField.get(arg5);
        }
        catch(IllegalAccessException v5) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", ((Throwable)v5));
            v5_1 = v0_1;
        }

        if(v5_1 == null) {
            return;
        }

        if(!ResourcesFlusher.sDrawableCacheFieldFetched) {
            try {
                ResourcesFlusher.sDrawableCacheField = v5_1.getClass().getDeclaredField("mDrawableCache");
                ResourcesFlusher.sDrawableCacheField.setAccessible(true);
            }
            catch(NoSuchFieldException v2) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", ((Throwable)v2));
            }

            ResourcesFlusher.sDrawableCacheFieldFetched = true;
        }

        if(ResourcesFlusher.sDrawableCacheField != null) {
            try {
                v5_1 = ResourcesFlusher.sDrawableCacheField.get(v5_1);
                goto label_53;
            }
            catch(IllegalAccessException v5) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", ((Throwable)v5));
            }
        }

        v5_1 = v0_1;
    label_53:
        if(v5_1 != null) {
            ResourcesFlusher.flushThemedResourcesCache(v5_1);
        }
    }

    @RequiresApi(value=16) private static void flushThemedResourcesCache(@NonNull Object arg4) {
        if(!ResourcesFlusher.sThemedResourceCacheClazzFetched) {
            try {
                ResourcesFlusher.sThemedResourceCacheClazz = Class.forName("android.content.res.ThemedResourceCache");
            }
            catch(ClassNotFoundException v0) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", ((Throwable)v0));
            }

            ResourcesFlusher.sThemedResourceCacheClazzFetched = true;
        }

        if(ResourcesFlusher.sThemedResourceCacheClazz == null) {
            return;
        }

        if(!ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesFieldFetched) {
            try {
                ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField = ResourcesFlusher.sThemedResourceCacheClazz.getDeclaredField("mUnthemedEntries");
                ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField.setAccessible(true);
            }
            catch(NoSuchFieldException v0_1) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", ((Throwable)v0_1));
            }

            ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesFieldFetched = true;
        }

        if(ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField == null) {
            return;
        }

        Object v0_2 = null;
        try {
            arg4 = ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField.get(arg4);
        }
        catch(IllegalAccessException v4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", ((Throwable)v4));
            arg4 = v0_2;
        }

        if(arg4 != null) {
            ((LongSparseArray)arg4).clear();
        }
    }
}

