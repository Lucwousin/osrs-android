package com.jagex.mobilesdk.auth.comms;

import android.os.AsyncTask;
import com.jagex.mobilesdk.common.comms.CommsResult;
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

public class LogoutComms extends AsyncTask {
    public interface PerformLogoutCallback {
        void onLogoutResult(CommsResult arg1, Exception arg2);
    }

    private PerformLogoutCallback callback;
    private Exception exception;
    private Map headers;
    private Map params;
    private int responseCode;
    private String url;

    LogoutComms(String arg1, Map arg2, Map arg3, PerformLogoutCallback arg4) {
        super();
        this.url = arg1;
        this.headers = arg2;
        this.callback = arg4;
        this.params = arg3;
    }

    protected Object doInBackground(Object[] arg1) {
        return this.doInBackground(((Void[])arg1));
    }

    protected String doInBackground(Void[] arg3) {
        return this.logoutAction(this.url, this.headers, this.params);
    }

    public String logoutAction(String arg4, Map arg5, Map arg6) {
        StringBuilder v6_1;
        BufferedReader v5_4;
        URLConnection v4;
        String v0 = "";
        String v1 = null;
        try {
            v4 = new URL(arg4).openConnection();
        }
        catch(Exception v5) {
            goto label_72;
        }
        catch(Throwable v5_1) {
            goto label_69;
        }

        try {
            v1 = "POST";
            goto label_6;
        }
        catch(Throwable v5_1) {
        label_64:
        }
        catch(Throwable v5_1) {
        label_74:
            ((HttpURLConnection)v1).disconnect();
            return v0;
        }
        catch(Exception v5) {
        label_66:
            URLConnection v1_2 = v4;
            try {
            label_72:
                this.exception = v5;
                if(v1 == null) {
                    return v0;
                }

                goto label_74;
            }
            catch(Throwable v5_1) {
            label_69:
                arg4 = v1;
            }
        }
        catch(Exception v5) {
            goto label_72;
            try {
            label_6:
                ((HttpURLConnection)v4).setRequestMethod(v1);
                ((HttpURLConnection)v4).setDoOutput(true);
                ((HttpURLConnection)v4).setInstanceFollowRedirects(false);
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
                    goto label_43;
                }
                else {
                    this.exception = new Exception("Invalid HTTP Response");
                    goto label_60;
                    while(true) {
                    label_43:
                        v1 = v5_4.readLine();
                        if(v1 == null) {
                            break;
                        }

                        v6_1.append(v1 + '\n');
                    }

                    v0 = v6_1.toString();
                }
            }
            catch(Exception v5) {
                goto label_66;
            }
            catch(Throwable v5_1) {
                goto label_64;
            }

        label_60:
            if(v4 == null) {
                return v0;
            }

            ((HttpURLConnection)v4).disconnect();
            return v0;
        }

        if((((URLConnection)arg4)) != null) {
            ((HttpURLConnection)arg4).disconnect();
        }

        throw v5_1;
    }

    public void logoutPostAction(String arg3, PerformLogoutCallback arg4) {
        arg4.onLogoutResult(new CommsResult(arg3, CommsUtils.mapResponseCode(this.responseCode)), this.exception);
    }

    protected void onPostExecute(Object arg1) {
        this.onPostExecute(((String)arg1));
    }

    protected void onPostExecute(String arg2) {
        this.logoutPostAction(arg2, this.callback);
    }
}

