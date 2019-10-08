package com.appsflyer.cache;

import java.util.Scanner;

public class RequestCacheData {
    private String ˋ;
    private String ˎ;
    private String ˏ;
    private String ॱ;

    public RequestCacheData(char[] arg3) {
        super();
        Scanner v0 = new Scanner(new String(arg3));
        while(v0.hasNextLine()) {
            String v3 = v0.nextLine();
            if(v3.startsWith("url=")) {
                this.ॱ = v3.substring(4).trim();
                continue;
            }

            if(v3.startsWith("version=")) {
                this.ˎ = v3.substring(8).trim();
                continue;
            }

            if(!v3.startsWith("data=")) {
                continue;
            }

            this.ˋ = v3.substring(5).trim();
        }

        v0.close();
    }

    public RequestCacheData(String arg1, String arg2, String arg3) {
        super();
        this.ॱ = arg1;
        this.ˋ = arg2;
        this.ˎ = arg3;
    }

    public String getCacheKey() {
        return this.ˏ;
    }

    public String getPostData() {
        return this.ˋ;
    }

    public String getRequestURL() {
        return this.ॱ;
    }

    public String getVersion() {
        return this.ˎ;
    }

    public void setCacheKey(String arg1) {
        this.ˏ = arg1;
    }

    public void setPostData(String arg1) {
        this.ˋ = arg1;
    }

    public void setRequestURL(String arg1) {
        this.ॱ = arg1;
    }

    public void setVersion(String arg1) {
        this.ˎ = arg1;
    }
}

