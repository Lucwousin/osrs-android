package com.jagex.mobilesdk.auth.comms;

import android.os.AsyncTask;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class RefreshComms extends AsyncTask {
    public interface RefreshTokenCallback {
        void onTokenResult(String arg1, Long arg2, String arg3, Exception arg4);
    }

    private RefreshTokenCallback callback;
    private Exception exception;
    private Map headers;
    private Map params;
    private int responseCode;
    private String url;

    RefreshComms(String arg1, Map arg2, Map arg3, RefreshTokenCallback arg4) {
        super();
        this.url = arg1;
        this.headers = arg2;
        this.callback = arg4;
        this.params = arg3;
    }

    protected Object doInBackground(Object[] arg1) {
        return this.doInBackground(((Void[])arg1));
    }

    protected JSONObject doInBackground(Void[] arg3) {
        return this.refreshTokenAction(this.url, this.headers, this.params);
    }

    protected void onPostExecute(Object arg1) {
        this.onPostExecute(((JSONObject)arg1));
    }

    protected void onPostExecute(JSONObject arg2) {
        this.refreshTokenPostAction(arg2, this.callback);
    }

    public JSONObject refreshTokenAction(String arg4, Map arg5, Map arg6) {
        HttpURLConnection v4_1;
        StringBuilder v6_1;
        BufferedReader v5_4;
        String v1;
        URLConnection v4;
        HttpURLConnection v0 = null;
        try {
            v4 = new URL(arg4).openConnection();
        }
        catch(Exception v5) {
            goto label_68;
        }
        catch(Throwable v5_1) {
            goto label_65;
        }

        try {
            v1 = "POST";
            goto label_5;
        }
        catch(Throwable v5_1) {
        }
        catch(Exception v5) {
        label_63:
            try {
            label_69:
                this.exception = v5;
                if((((URLConnection)v4_1)) == null) {
                    goto label_72;
                }
            }
            catch(Throwable v5_1) {
                goto label_74;
            }

        label_60:
            v4_1.disconnect();
        label_72:
            return ((JSONObject)v0);
        }
        catch(Throwable v5_1) {
        label_65:
            v4 = ((URLConnection)v0);
            goto label_74;
            try {
            label_5:
                ((HttpURLConnection)v4).setRequestMethod(v1);
                ((HttpURLConnection)v4).setDoOutput(true);
                Iterator v5_2 = arg5.entrySet().iterator();
                while(v5_2.hasNext()) {
                    Object v1_1 = v5_2.next();
                    ((HttpURLConnection)v4).setRequestProperty(((Map$Entry)v1_1).getKey(), ((Map$Entry)v1_1).getValue());
                }

                String v5_3 = CommsUtils.formUrlEncode(arg6);
                ((HttpURLConnection)v4).setRequestProperty("Content-Length", String.valueOf(v5_3.length()));
                OutputStreamWriter v6 = new OutputStreamWriter(((HttpURLConnection)v4).getOutputStream());
                v6.write(v5_3);
                v6.flush();
                ((HttpURLConnection)v4).connect();
                this.responseCode = ((HttpURLConnection)v4).getResponseCode();
                if(this.responseCode == 200) {
                    v5_4 = new BufferedReader(new InputStreamReader(((HttpURLConnection)v4).getInputStream()));
                    v6_1 = new StringBuilder();
                    goto label_40;
                }
                else {
                    this.exception = new Exception("Invalid HTTP Response");
                    goto label_59;
                    while(true) {
                    label_40:
                        v1 = v5_4.readLine();
                        if(v1 == null) {
                            break;
                        }

                        v6_1.append(v1 + '\n');
                    }

                    JSONObject v0_1 = new JSONObject(v6_1.toString());
                }
            }
            catch(Exception v5) {
                goto label_63;
            }
            catch(Throwable v5_1) {
                goto label_74;
            }

        label_59:
            if(v4 == null) {
                goto label_72;
            }

            goto label_60;
        }
        catch(Exception v5) {
        label_68:
            v4_1 = v0;
            goto label_69;
        }

    label_74:
        if((((URLConnection)v4_1)) != null) {
            v4_1.disconnect();
        }

        throw v5_1;
    }

    public void refreshTokenPostAction(JSONObject arg10, RefreshTokenCallback arg11) {
        long v0 = 0;
        try {
            String v2 = "";
            Long v3 = Long.valueOf(v0);
            String v4 = "";
            if(arg10 != null) {
                v2 = arg10.getString("access_token");
                v3 = Long.valueOf(System.currentTimeMillis() + arg10.getLong("expires_in") * 1000);
                v4 = arg10.getString("refresh_token");
            }

            arg11.onTokenResult(v2, v3, v4, this.exception);
        }
        catch(JSONException ) {
            arg11.onTokenResult("", Long.valueOf(v0), "", this.exception);
        }
    }
}

