package com.appsflyer;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import java.util.HashMap;
import java.util.Map;

final class e implements InstallReferrerStateListener {
    private d ˋ;
    private InstallReferrerClient ˎ;

    e() {
        super();
    }

    public final void onInstallReferrerServiceDisconnected() {
        AFLogger.afDebugLog("Install Referrer service disconnected");
    }

    public final void onInstallReferrerSetupFinished(int arg6) {
        ReferrerDetails v6_1;
        HashMap v0 = new HashMap();
        ((Map)v0).put("code", String.valueOf(arg6));
        ReferrerDetails v1 = null;
        switch(arg6) {
            case 0: {
                goto label_16;
            }
            case 1: {
                goto label_13;
            }
            case 2: {
                goto label_10;
            }
        }

        AFLogger.afWarnLog("responseCode not found.");
        goto label_49;
    label_10:
        AFLogger.afWarnLog("InstallReferrer not supported");
        goto label_49;
    label_13:
        AFLogger.afWarnLog("InstallReferrer not supported");
        goto label_49;
        try {
        label_16:
            AFLogger.afDebugLog("InstallReferrer connected");
            if(!this.ˎ.isReady()) {
                goto label_32;
            }

            v6_1 = this.ˎ.getInstallReferrer();
        }
        catch(Throwable v6) {
            goto label_39;
        }

        try {
            this.ˎ.endConnection();
            v1 = v6_1;
            goto label_49;
        }
        catch(Throwable v1_1) {
            Throwable v4 = v1_1;
            v1 = v6_1;
            v6 = v4;
            goto label_39;
        }

        try {
        label_32:
            AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
            ((Map)v0).put("err", "ReferrerClient: InstallReferrer is not ready");
            goto label_49;
        }
        catch(Throwable v6) {
        }

    label_39:
        StringBuilder v2 = new StringBuilder("Failed to get install referrer: ");
        v2.append(v6.getMessage());
        AFLogger.afWarnLog(v2.toString());
        ((Map)v0).put("err", v6.getMessage());
    label_49:
        if(v1 != null) {
            try {
                if(v1.getInstallReferrer() != null) {
                    ((Map)v0).put("val", v1.getInstallReferrer());
                }

                ((Map)v0).put("clk", Long.toString(v1.getReferrerClickTimestampSeconds()));
                ((Map)v0).put("install", Long.toString(v1.getInstallBeginTimestampSeconds()));
            }
            catch(Exception v6_2) {
                ((Throwable)v6_2).printStackTrace();
                ((Map)v0).put("val", "-1");
                ((Map)v0).put("clk", "-1");
                ((Map)v0).put("install", "-1");
            }
        }

        if(this.ˋ != null) {
            this.ˋ.onHandleReferrer(((Map)v0));
        }
    }

    protected final void ॱ(Context arg1, d arg2) {
        this.ˋ = arg2;
        try {
            this.ˎ = InstallReferrerClient.newBuilder(arg1).build();
            this.ˎ.startConnection(((InstallReferrerStateListener)this));
            return;
        }
        catch(Throwable v1) {
            AFLogger.afErrorLog("referrerClient -> startConnection", v1);
            return;
        }
    }
}

