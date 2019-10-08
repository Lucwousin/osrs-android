package androidx.core.net;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build$VERSION;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ConnectivityManagerCompat {
    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface RestrictBackgroundStatus {
    }

    public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
    public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
    public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;

    private ConnectivityManagerCompat() {
        super();
    }

    @Nullable @RequiresPermission(value="android.permission.ACCESS_NETWORK_STATE") public static NetworkInfo getNetworkInfoFromBroadcast(@NonNull ConnectivityManager arg1, @NonNull Intent arg2) {
        Parcelable v2 = arg2.getParcelableExtra("networkInfo");
        if(v2 != null) {
            return arg1.getNetworkInfo(((NetworkInfo)v2).getType());
        }

        return null;
    }

    public static int getRestrictBackgroundStatus(@NonNull ConnectivityManager arg2) {
        if(Build$VERSION.SDK_INT >= 24) {
            return arg2.getRestrictBackgroundStatus();
        }

        return 3;
    }

    @RequiresPermission(value="android.permission.ACCESS_NETWORK_STATE") public static boolean isActiveNetworkMetered(@NonNull ConnectivityManager arg2) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg2.isActiveNetworkMetered();
        }

        NetworkInfo v2 = arg2.getActiveNetworkInfo();
        if(v2 == null) {
            return 1;
        }

        switch(v2.getType()) {
            case 0: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: {
                return 1;
            }
            case 1: 
            case 7: 
            case 9: {
                return 0;
            }
        }

        return 1;
    }
}

