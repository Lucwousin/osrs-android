package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.PermissionChecker;
import java.util.Calendar;

class TwilightManager {
    class TwilightState {
        boolean isNight;
        long nextUpdate;
        long todaySunrise;
        long todaySunset;
        long tomorrowSunrise;
        long yesterdaySunset;

        TwilightState() {
            super();
        }
    }

    private static final int SUNRISE = 6;
    private static final int SUNSET = 22;
    private static final String TAG = "TwilightManager";
    private final Context mContext;
    private final LocationManager mLocationManager;
    private final TwilightState mTwilightState;
    private static TwilightManager sInstance;

    @VisibleForTesting TwilightManager(@NonNull Context arg2, @NonNull LocationManager arg3) {
        super();
        this.mTwilightState = new TwilightState();
        this.mContext = arg2;
        this.mLocationManager = arg3;
    }

    static TwilightManager getInstance(@NonNull Context arg2) {
        if(TwilightManager.sInstance == null) {
            arg2 = arg2.getApplicationContext();
            TwilightManager.sInstance = new TwilightManager(arg2, arg2.getSystemService("location"));
        }

        return TwilightManager.sInstance;
    }

    @SuppressLint(value={"MissingPermission"}) private Location getLastKnownLocation() {
        Location v1 = null;
        Location v0 = PermissionChecker.checkSelfPermission(this.mContext, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? this.getLastKnownLocationForProvider("network") : v1;
        if(PermissionChecker.checkSelfPermission(this.mContext, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            v1 = this.getLastKnownLocationForProvider("gps");
        }

        if(v1 != null && v0 != null) {
            if(v1.getTime() > v0.getTime()) {
                v0 = v1;
            }

            return v0;
        }

        if(v1 != null) {
            v0 = v1;
        }

        return v0;
    }

    @RequiresPermission(anyOf={"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}) private Location getLastKnownLocationForProvider(String arg3) {
        try {
            if(!this.mLocationManager.isProviderEnabled(arg3)) {
                return null;
            }

            return this.mLocationManager.getLastKnownLocation(arg3);
        }
        catch(Exception v3) {
            Log.d("TwilightManager", "Failed to get last known location", ((Throwable)v3));
        }

        return null;
    }

    boolean isNight() {
        TwilightState v0 = this.mTwilightState;
        if(this.isStateValid()) {
            return v0.isNight;
        }

        Location v1 = this.getLastKnownLocation();
        if(v1 != null) {
            this.updateState(v1);
            return v0.isNight;
        }

        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int v0_1 = Calendar.getInstance().get(11);
        boolean v0_2 = v0_1 < 6 || v0_1 >= 22 ? true : false;
        return v0_2;
    }

    private boolean isStateValid() {
        boolean v0 = this.mTwilightState.nextUpdate > System.currentTimeMillis() ? true : false;
        return v0;
    }

    @VisibleForTesting static void setInstance(TwilightManager arg0) {
        TwilightManager.sInstance = arg0;
    }

    private void updateState(@NonNull Location arg23) {
        TwilightState v1 = this.mTwilightState;
        long v9 = System.currentTimeMillis();
        TwilightCalculator v11 = TwilightCalculator.getInstance();
        long v12 = 86400000;
        v11.calculateTwilight(v9 - v12, arg23.getLatitude(), arg23.getLongitude());
        long v14 = v11.sunset;
        v11.calculateTwilight(v9, arg23.getLatitude(), arg23.getLongitude());
        boolean v7 = v11.state == 1 ? true : false;
        long v5 = v11.sunrise;
        long v20 = v14;
        v14 = v11.sunset;
        long v3 = v12 + v9;
        v12 = v5;
        boolean v0 = v7;
        v11.calculateTwilight(v3, arg23.getLatitude(), arg23.getLongitude());
        long v2 = v11.sunrise;
        long v4 = 0;
        long v6 = -1;
        if(v12 == v6 || v14 == v6) {
            v4 = 43200000 + v9;
        }
        else {
            if(v9 > v14) {
                v4 += v2;
            }
            else if(v9 > v12) {
                v4 += v14;
            }
            else {
                v4 += v12;
            }

            v4 += 60000;
        }

        v1.isNight = v0;
        v1.yesterdaySunset = v20;
        v1.todaySunrise = v12;
        v1.todaySunset = v14;
        v1.tomorrowSunrise = v2;
        v1.nextUpdate = v4;
    }
}

