package com.appsflyer.share;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask$ResponseListener;
import com.appsflyer.ServerConfigHandler;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;

public class LinkGenerator {
    private String ʻ;
    private String ʼ;
    private String ʽ;
    private String ˊ;
    private String ˋ;
    private Map ˋॱ;
    private String ˎ;
    private String ˏ;
    private String ˏॱ;
    private String ॱ;
    private Map ॱˊ;
    private String ॱॱ;
    private String ᐝ;

    public LinkGenerator(String arg2) {
        super();
        this.ˋॱ = new HashMap();
        this.ॱˊ = new HashMap();
        this.ˊ = arg2;
    }

    public LinkGenerator addParameter(String arg2, String arg3) {
        this.ˋॱ.put(arg2, arg3);
        return this;
    }

    public LinkGenerator addParameters(Map arg2) {
        if(arg2 != null) {
            this.ˋॱ.putAll(arg2);
        }

        return this;
    }

    public String generateLink() {
        return this.ˏ().toString();
    }

    public void generateLink(Context arg6, ResponseListener arg7) {
        String v0 = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        if(!this.ˋॱ.isEmpty()) {
            Iterator v1 = this.ˋॱ.entrySet().iterator();
            while(v1.hasNext()) {
                Object v2 = v1.next();
                this.ॱˊ.put(((Map$Entry)v2).getKey(), ((Map$Entry)v2).getValue());
            }
        }

        this.ˏ();
        ShareInviteHelper.generateUserInviteLink(arg6, v0, this.ॱˊ, arg7);
    }

    public String getCampaign() {
        return this.ˏ;
    }

    public String getChannel() {
        return this.ˎ;
    }

    public String getMediaSource() {
        return this.ˊ;
    }

    public Map getParameters() {
        return this.ˋॱ;
    }

    public LinkGenerator setBaseDeeplink(String arg1) {
        this.ˏॱ = arg1;
        return this;
    }

    public LinkGenerator setBaseURL(String arg5, String arg6, String arg7) {
        int v2 = 2;
        if(arg5 == null || arg5.length() <= 0) {
            this.ᐝ = String.format("https://%s/%s", ServerConfigHandler.getUrl("%sapp.%s"), arg7);
        }
        else {
            if(arg6 == null || arg6.length() < 5) {
                arg6 = "go.onelink.me";
            }

            this.ᐝ = String.format("https://%s/%s", arg6, arg5);
        }

        return this;
    }

    public LinkGenerator setCampaign(String arg1) {
        this.ˏ = arg1;
        return this;
    }

    public LinkGenerator setChannel(String arg1) {
        this.ˎ = arg1;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String arg1) {
        this.ʼ = arg1;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String arg1) {
        this.ॱ = arg1;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String arg1) {
        this.ʽ = arg1;
        return this;
    }

    public LinkGenerator setReferrerName(String arg1) {
        this.ॱॱ = arg1;
        return this;
    }

    public LinkGenerator setReferrerUID(String arg1) {
        this.ˋ = arg1;
        return this;
    }

    final LinkGenerator ˊ(String arg1) {
        this.ᐝ = arg1;
        return this;
    }

    private static String ˋ(String arg2, String arg3) {
        try {
            return URLEncoder.encode(arg2, "utf8");
        }
        catch(Throwable ) {
            return "";
        }
        catch(UnsupportedEncodingException ) {
            StringBuilder v0 = new StringBuilder("Illegal ");
            v0.append(arg3);
            v0.append(": ");
            v0.append(arg2);
            AFLogger.afInfoLog(v0.toString());
            return "";
        }
    }

    final LinkGenerator ˏ(String arg1) {
        this.ʻ = arg1;
        return this;
    }

    private StringBuilder ˏ() {
        StringBuilder v0 = new StringBuilder();
        if(this.ᐝ == null || !this.ᐝ.startsWith("http")) {
            v0.append(ServerConfigHandler.getUrl("https://%sapp.%s"));
        }
        else {
            v0.append(this.ᐝ);
        }

        if(this.ʻ != null) {
            v0.append('/');
            v0.append(this.ʻ);
        }

        this.ॱˊ.put("pid", this.ˊ);
        v0.append('?');
        v0.append("pid=");
        v0.append(LinkGenerator.ˋ(this.ˊ, "media source"));
        char v2 = '&';
        if(this.ˋ != null) {
            this.ॱˊ.put("af_referrer_uid", this.ˋ);
            v0.append(v2);
            v0.append("af_referrer_uid=");
            v0.append(LinkGenerator.ˋ(this.ˋ, "referrerUID"));
        }

        if(this.ˎ != null) {
            this.ॱˊ.put("af_channel", this.ˎ);
            v0.append(v2);
            v0.append("af_channel=");
            v0.append(LinkGenerator.ˋ(this.ˎ, "channel"));
        }

        if(this.ॱ != null) {
            this.ॱˊ.put("af_referrer_customer_id", this.ॱ);
            v0.append(v2);
            v0.append("af_referrer_customer_id=");
            v0.append(LinkGenerator.ˋ(this.ॱ, "referrerCustomerId"));
        }

        if(this.ˏ != null) {
            this.ॱˊ.put("c", this.ˏ);
            v0.append(v2);
            v0.append("c=");
            v0.append(LinkGenerator.ˋ(this.ˏ, "campaign"));
        }

        if(this.ॱॱ != null) {
            this.ॱˊ.put("af_referrer_name", this.ॱॱ);
            v0.append(v2);
            v0.append("af_referrer_name=");
            v0.append(LinkGenerator.ˋ(this.ॱॱ, "referrerName"));
        }

        if(this.ʽ != null) {
            this.ॱˊ.put("af_referrer_image_url", this.ʽ);
            v0.append(v2);
            v0.append("af_referrer_image_url=");
            v0.append(LinkGenerator.ˋ(this.ʽ, "referrerImageURL"));
        }

        if(this.ˏॱ != null) {
            StringBuilder v1 = new StringBuilder();
            v1.append(this.ˏॱ);
            String v3 = this.ˏॱ.endsWith("/") ? "" : "/";
            v1.append(v3);
            if(this.ʼ != null) {
                v1.append(this.ʼ);
            }

            this.ॱˊ.put("af_dp", v1.toString());
            v0.append(v2);
            v0.append("af_dp=");
            v0.append(LinkGenerator.ˋ(this.ˏॱ, "baseDeeplink"));
            if(this.ʼ == null) {
                goto label_154;
            }

            String v1_1 = this.ˏॱ.endsWith("/") ? "" : "%2F";
            v0.append(v1_1);
            v0.append(LinkGenerator.ˋ(this.ʼ, "deeplinkPath"));
        }

    label_154:
        Iterator v1_2 = this.ˋॱ.keySet().iterator();
        while(v1_2.hasNext()) {
            Object v3_1 = v1_2.next();
            String v4 = v0.toString();
            StringBuilder v5 = new StringBuilder();
            v5.append(((String)v3_1));
            v5.append("=");
            v5.append(LinkGenerator.ˋ(this.ˋॱ.get(v3_1), ((String)v3_1)));
            if(v4.contains(v5.toString())) {
                continue;
            }

            v0.append(v2);
            v0.append(((String)v3_1));
            v0.append('=');
            v0.append(LinkGenerator.ˋ(this.ˋॱ.get(v3_1), ((String)v3_1)));
        }

        return v0;
    }
}

