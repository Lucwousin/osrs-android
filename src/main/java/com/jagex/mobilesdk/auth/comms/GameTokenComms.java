package com.jagex.mobilesdk.auth.comms;

import android.os.AsyncTask;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Set;

public class GameTokenComms extends AsyncTask {
    public interface FetchGameTokenCallback {
        void onGameTokenResult(CommsResult arg1, Exception arg2);
    }

    private final FetchGameTokenCallback callback;
    private Exception exception;
    private final Map headers;
    private int responseCode;
    private final String url;

    GameTokenComms(String arg1, Map arg2, FetchGameTokenCallback arg3) {
        super();
        this.url = arg1;
        this.headers = arg2;
        this.callback = arg3;
    }

    protected Object doInBackground(Object[] arg1) {
        return this.doInBackground(((Void[])arg1));
    }

    protected String doInBackground(Void[] arg2) {
        return this.fetchGameTokenAction(this.url, this.headers);
    }

    public String fetchGameTokenAction(String arg4, Map arg5) {
        StringBuilder v1_2;
        BufferedReader v5_4;
        Set v5_2;
        URLConnection v4;
        String v0 = "";
        URLConnection v1 = null;
        try {
            v4 = new URL(arg4).openConnection();
        }
        catch(Exception v5) {
            goto label_51;
        }
        catch(Throwable v5_1) {
            goto label_48;
        }

        try {
            v5_2 = arg5.entrySet();
            goto label_6;
        }
        catch(Throwable v5_1) {
        label_43:
        }
        catch(Throwable v5_1) {
        label_53:
            ((HttpURLConnection)v1).disconnect();
            return v0;
        }
        catch(Exception v5) {
        label_45:
            v1 = v4;
            try {
            label_51:
                this.exception = v5;
                if(v1 == null) {
                    return v0;
                }

                goto label_53;
            }
            catch(Throwable v5_1) {
            label_48:
                v4 = v1;
            }
        }
        catch(Exception v5) {
            goto label_51;
            try {
            label_6:
                Iterator v5_3 = v5_2.iterator();
                while(v5_3.hasNext()) {
                    Object v1_1 = v5_3.next();
                    ((HttpURLConnection)v4).setRequestProperty(((Map$Entry)v1_1).getKey(), ((Map$Entry)v1_1).getValue());
                }

                ((HttpURLConnection)v4).setInstanceFollowRedirects(false);
                this.responseCode = ((HttpURLConnection)v4).getResponseCode();
                if(this.responseCode == 200) {
                    v5_4 = new BufferedReader(new InputStreamReader(((HttpURLConnection)v4).getInputStream()));
                    v1_2 = new StringBuilder();
                    goto label_28;
                }
                else {
                    this.exception = new Exception("Invalid HTTP Response");
                    goto label_39;
                    while(true) {
                    label_28:
                        String v2 = v5_4.readLine();
                        if(v2 == null) {
                            break;
                        }

                        v1_2.append(v2);
                    }

                    v0 = v1_2.toString();
                }
            }
            catch(Exception v5) {
                goto label_45;
            }
            catch(Throwable v5_1) {
                goto label_43;
            }

        label_39:
            if(v4 == null) {
                return v0;
            }

            ((HttpURLConnection)v4).disconnect();
            return v0;
        }

        if(v4 != null) {
            ((HttpURLConnection)v4).disconnect();
        }

        throw v5_1;
    }

    public void fetchGameTokenPostAction(String arg3, FetchGameTokenCallback arg4) {
        arg4.onGameTokenResult(new CommsResult(arg3, CommsUtils.mapResponseCode(this.responseCode)), this.exception);
    }

    protected void onPostExecute(Object arg1) {
        this.onPostExecute(((String)arg1));
    }

    protected void onPostExecute(String arg2) {
        this.fetchGameTokenPostAction(arg2, this.callback);
    }
}

