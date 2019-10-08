package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api$Client;

public class GoogleApiAvailabilityCache {
    private final SparseIntArray zaor;
    private GoogleApiAvailabilityLight zaos;

    public GoogleApiAvailabilityCache(@NonNull GoogleApiAvailabilityLight arg2) {
        super();
        this.zaor = new SparseIntArray();
        Preconditions.checkNotNull(arg2);
        this.zaos = arg2;
    }

    public GoogleApiAvailabilityCache() {
        this(GoogleApiAvailability.getInstance());
    }

    public void flush() {
        this.zaor.clear();
    }

    public int getClientAvailability(@NonNull Context arg7, @NonNull Client arg8) {
        Preconditions.checkNotNull(arg7);
        Preconditions.checkNotNull(arg8);
        if(!arg8.requiresGooglePlayServices()) {
            return 0;
        }

        int v8 = arg8.getMinApkVersion();
        int v2 = -1;
        int v0 = this.zaor.get(v8, v2);
        if(v0 != v2) {
            return v0;
        }

        int v3;
        for(v3 = 0; v3 < this.zaor.size(); ++v3) {
            int v4 = this.zaor.keyAt(v3);
            if(v4 > v8 && this.zaor.get(v4) == 0) {
                v0 = 0;
                break;
            }
        }

        if(v0 == v2) {
            v0 = this.zaos.isGooglePlayServicesAvailable(arg7, v8);
        }

        this.zaor.put(v8, v0);
        return v0;
    }
}

