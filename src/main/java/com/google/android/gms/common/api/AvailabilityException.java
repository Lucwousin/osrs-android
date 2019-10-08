package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zai;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AvailabilityException extends Exception {
    private final ArrayMap zaay;

    public AvailabilityException(ArrayMap arg1) {
        super();
        this.zaay = arg1;
    }

    public ConnectionResult getConnectionResult(GoogleApi arg3) {
        zai v3 = arg3.zak();
        boolean v0 = this.zaay.get(v3) != null ? true : false;
        Preconditions.checkArgument(v0, "The given API was not part of the availability request.");
        return this.zaay.get(v3);
    }

    public String getMessage() {
        ArrayList v0 = new ArrayList();
        Iterator v1 = this.zaay.keySet().iterator();
        int v2 = 1;
        while(v1.hasNext()) {
            Object v3 = v1.next();
            Object v4 = this.zaay.get(v3);
            if(((ConnectionResult)v4).isSuccess()) {
                v2 = 0;
            }

            String v3_1 = ((zai)v3).zan();
            String v4_1 = String.valueOf(v4);
            StringBuilder v6 = new StringBuilder(String.valueOf(v3_1).length() + 2 + String.valueOf(v4_1).length());
            v6.append(v3_1);
            v6.append(": ");
            v6.append(v4_1);
            ((List)v0).add(v6.toString());
        }

        StringBuilder v1_1 = new StringBuilder();
        if(v2 != 0) {
            v1_1.append("None of the queried APIs are available. ");
        }
        else {
            v1_1.append("Some of the queried APIs are unavailable. ");
        }

        v1_1.append(TextUtils.join("; ", ((Iterable)v0)));
        return v1_1.toString();
    }

    public final ArrayMap zaj() {
        return this.zaay;
    }
}

