package com.appsflyer.share;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask$ResponseListener;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.OneLinkHttpTask$HttpsUrlConnectionProvider;
import com.appsflyer.OneLinkHttpTask;
import java.util.HashMap;
import java.util.Map;

public class ShareInviteHelper {
    public ShareInviteHelper() {
        super();
    }

    public static LinkGenerator generateInviteUrl(Context arg6) {
        LinkGenerator v6 = new LinkGenerator("af_app_invites").setBaseURL(AppsFlyerProperties.getInstance().getString("oneLinkSlug"), AppsFlyerProperties.getInstance().getString("onelinkDomain"), arg6.getPackageName()).setReferrerUID(AppsFlyerLib.getInstance().getAppsFlyerUID(arg6)).setReferrerCustomerId(AppsFlyerProperties.getInstance().getString("AppUserId")).addParameter("af_siteid", arg6.getPackageName());
        String v0 = AppsFlyerProperties.getInstance().getString("onelinkScheme");
        if(v0 != null && v0.length() > 3) {
            v6.setBaseDeeplink(v0);
        }

        return v6;
    }

    public static void generateUserInviteLink(@NonNull Context arg7, @NonNull String arg8, @NonNull Map arg9, @NonNull ResponseListener arg10) {
        if(AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }

        CreateOneLinkHttpTask v6 = new CreateOneLinkHttpTask(arg8, arg9, AppsFlyerLib.getInstance(), arg7, AppsFlyerLib.getInstance().isTrackingStopped());
        ((OneLinkHttpTask)v6).setConnProvider(new HttpsUrlConnectionProvider());
        v6.setListener(arg10);
        AFExecutor.getInstance().getThreadPoolExecutor().execute(((Runnable)v6));
    }

    public static void trackInvite(Context arg3, String arg4, Map arg5) {
        if(TextUtils.isEmpty(((CharSequence)arg4))) {
            AFLogger.afWarnLog("[Invite] Cannot track App-Invite with null/empty channel");
            return;
        }

        if(AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track Invite is disabled", true);
            return;
        }

        LinkGenerator v0 = ShareInviteHelper.generateInviteUrl(arg3);
        v0.addParameters(arg5);
        AFLogger.afDebugLog("[Invite] Tracking App-Invite via channel: ".concat(String.valueOf(arg4)));
        StringBuilder v5 = new StringBuilder("[Invite] Generated URL: ");
        v5.append(v0.generateLink());
        AFLogger.afDebugLog(v5.toString());
        String v5_1 = v0.getMediaSource();
        if("af_app_invites".equals(v5_1)) {
            v5_1 = "af_invite";
        }
        else if("af_user_share".equals(v5_1)) {
            v5_1 = "af_share";
        }

        HashMap v1 = new HashMap();
        if(v0.getParameters() != null) {
            ((Map)v1).putAll(v0.getParameters());
        }

        ((Map)v1).put("af_channel", arg4);
        AppsFlyerLib.getInstance().trackEvent(arg3, v5_1, ((Map)v1));
    }
}

