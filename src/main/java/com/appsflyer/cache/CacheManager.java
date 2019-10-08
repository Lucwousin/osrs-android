package com.appsflyer.cache;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class CacheManager {
    public static final String AF_CACHE_DIR = "AFRequestCache";
    public static final int CACHE_MAX_SIZE = 40;
    private static CacheManager ˋ;

    static {
        CacheManager.ˋ = new CacheManager();
    }

    private CacheManager() {
        super();
    }

    public void cacheRequest(RequestCacheData arg6, Context arg7) {
        OutputStreamWriter v7;
        OutputStreamWriter v0 = null;
        try {
            File v1 = new File(arg7.getFilesDir(), "AFRequestCache");
            if(!v1.exists()) {
                v1.mkdir();
                return;
            }

            File[] v1_1 = v1.listFiles();
            if(v1_1 != null && v1_1.length > 40) {
                Log.i("AppsFlyer_4.9.0", "reached cache limit, not caching request");
                return;
            }

            Log.i("AppsFlyer_4.9.0", "caching request...");
            v1 = new File(new File(arg7.getFilesDir(), "AFRequestCache"), Long.toString(System.currentTimeMillis()));
            v1.createNewFile();
            v7 = new OutputStreamWriter(new FileOutputStream(v1.getPath(), true));
        }
        catch(Throwable v6) {
            goto label_62;
        }
        catch(Exception ) {
            goto label_63;
        }

        try {
            ((Writer)v7).write("version=");
            ((Writer)v7).write(arg6.getVersion());
            ((Writer)v7).write(10);
            ((Writer)v7).write("url=");
            ((Writer)v7).write(arg6.getRequestURL());
            ((Writer)v7).write(10);
            ((Writer)v7).write("data=");
            ((Writer)v7).write(arg6.getPostData());
            ((Writer)v7).write(10);
            ((Writer)v7).flush();
            goto label_53;
        }
        catch(Throwable v6) {
            v0 = v7;
        }
        catch(Exception ) {
            v0 = v7;
            try {
            label_63:
                Log.i("AppsFlyer_4.9.0", "Could not cache request");
                if(v0 == null) {
                    return;
                }
            }
            catch(Throwable v6) {
            label_62:
                goto label_71;
            }

            try {
                ((Writer)v0).close();
            }
            catch(IOException ) {
                return;
            }

            return;
        }

    label_71:
        if(v0 != null) {
            try {
                ((Writer)v0).close();
                goto label_73;
            }
            catch(IOException ) {
            label_73:
                throw v6;
            }
        }

        goto label_73;
        try {
        label_53:
            ((Writer)v7).close();
            return;
        }
        catch(IOException ) {
            return;
        }
    }

    public void clearCache(Context arg8) {
        try {
            File v0 = new File(arg8.getFilesDir(), "AFRequestCache");
            if(!v0.exists()) {
                v0.mkdir();
                return;
            }

            File[] v0_1 = v0.listFiles();
            int v1 = v0_1.length;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                File v3 = v0_1[v2];
                StringBuilder v5 = new StringBuilder("Found cached request");
                v5.append(v3.getName());
                Log.i("AppsFlyer_4.9.0", v5.toString());
                this.deleteRequest(CacheManager.ˏ(v3).getCacheKey(), arg8);
            }
        }
        catch(Exception ) {
            goto label_27;
        }

        return;
    label_27:
        Log.i("AppsFlyer_4.9.0", "Could not cache request");
    }

    public void deleteRequest(String arg4, Context arg5) {
        File v5 = new File(new File(arg5.getFilesDir(), "AFRequestCache"), arg4);
        StringBuilder v1 = new StringBuilder("Deleting ");
        v1.append(arg4);
        v1.append(" from cache");
        Log.i("AppsFlyer_4.9.0", v1.toString());
        if(v5.exists()) {
            try {
                v5.delete();
                return;
            }
            catch(Exception v5_1) {
                v1 = new StringBuilder("Could not delete ");
                v1.append(arg4);
                v1.append(" from cache");
                Log.i("AppsFlyer_4.9.0", v1.toString(), ((Throwable)v5_1));
            }
        }
    }

    public List getCachedRequests(Context arg8) {
        ArrayList v0 = new ArrayList();
        try {
            File v1 = new File(arg8.getFilesDir(), "AFRequestCache");
            if(!v1.exists()) {
                v1.mkdir();
                goto label_30;
            }

            File[] v8 = v1.listFiles();
            int v1_1 = v8.length;
            int v2;
            for(v2 = 0; v2 < v1_1; ++v2) {
                File v3 = v8[v2];
                StringBuilder v5 = new StringBuilder("Found cached request");
                v5.append(v3.getName());
                Log.i("AppsFlyer_4.9.0", v5.toString());
                ((List)v0).add(CacheManager.ˏ(v3));
            }
        }
        catch(Exception ) {
            Log.i("AppsFlyer_4.9.0", "Could not cache request");
        }

    label_30:
        return ((List)v0);
    }

    public static CacheManager getInstance() {
        return CacheManager.ˋ;
    }

    public void init(Context arg4) {
        try {
            if(!new File(arg4.getFilesDir(), "AFRequestCache").exists()) {
                new File(arg4.getFilesDir(), "AFRequestCache").mkdir();
            }
        }
        catch(Exception ) {
            Log.i("AppsFlyer_4.9.0", "Could not create cache directory");
            return;
        }
    }

    private static RequestCacheData ˏ(File arg4) {
        RequestCacheData v3;
        FileReader v1;
        RequestCacheData v0 = null;
        try {
            v1 = new FileReader(arg4);
        }
        catch(Throwable v4) {
            v1 = ((FileReader)v0);
            goto label_17;
        }
        catch(Exception ) {
            v1 = ((FileReader)v0);
            goto label_21;
        }

        try {
            char[] v2 = new char[((int)arg4.length())];
            ((Reader)v1).read(v2);
            v3 = new RequestCacheData(v2);
            v3.setCacheKey(arg4.getName());
            goto label_11;
        }
        catch(Throwable v4) {
        }
        catch(Exception ) {
        label_21:
            if(v1 != null) {
                try {
                    ((Reader)v1).close();
                    return v0;
                }
                catch(IOException ) {
                    return v0;
                }
            }

            return v0;
        }

    label_17:
        if(v1 != null) {
            try {
                ((Reader)v1).close();
                goto label_19;
            }
            catch(IOException ) {
            label_19:
                throw v4;
            }
        }

        goto label_19;
        try {
        label_11:
            ((Reader)v1).close();
            return v3;
        }
        catch(IOException ) {
            return v3;
        }
    }
}

