package com.jagex.mobilesdk.auth.comms;

import android.os.AsyncTask;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class ShieldOAuth2Comms extends AsyncTask {
    public interface ShieldOAuth2Callback {
        void onShieldOAuth2Result(CommsResult arg1, Exception arg2);
    }

    private final ShieldOAuth2Callback callback;
    private Exception exception;
    private final Map headers;
    private final Map params;
    private int responseCode;
    private final String url;

    ShieldOAuth2Comms(String arg1, Map arg2, Map arg3, ShieldOAuth2Callback arg4) {
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
        return this.shieldOAuth2Action(this.url, this.headers, this.params);
    }

    protected void onPostExecute(Object arg1) {
        this.onPostExecute(((JSONObject)arg1));
    }

    protected void onPostExecute(JSONObject arg2) {
        this.shieldOAuth2PostAction(arg2, this.callback);
    }

    public JSONObject shieldOAuth2Action(String arg4, Map arg5, Map arg6) {
        JSONObject v6_2;
        StringBuilder v6_1;
        BufferedReader v5_4;
        String v1;
        URLConnection v4;
        JSONObject v0 = null;
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
                if(v4 == null) {
                    return v0;
                }
            }
            catch(Throwable v5_1) {
                goto label_74;
            }

        label_71:
            ((HttpsURLConnection)v4).disconnect();
            return v0;
        }
        catch(Throwable v5_1) {
        label_65:
            v4 = ((URLConnection)v0);
            goto label_74;
            try {
            label_5:
                ((HttpsURLConnection)v4).setRequestMethod(v1);
                ((HttpsURLConnection)v4).setDoOutput(true);
                Iterator v5_2 = arg5.entrySet().iterator();
                while(v5_2.hasNext()) {
                    Object v1_1 = v5_2.next();
                    ((HttpsURLConnection)v4).setRequestProperty(((Map$Entry)v1_1).getKey(), ((Map$Entry)v1_1).getValue());
                }

                String v5_3 = CommsUtils.formUrlEncode(arg6);
                ((HttpsURLConnection)v4).setRequestProperty("Content-Length", String.valueOf(v5_3.length()));
                OutputStreamWriter v6 = new OutputStreamWriter(((HttpsURLConnection)v4).getOutputStream());
                v6.write(v5_3);
                v6.flush();
                ((HttpsURLConnection)v4).connect();
                this.responseCode = ((HttpsURLConnection)v4).getResponseCode();
                if(this.responseCode == 200) {
                    v5_4 = new BufferedReader(new InputStreamReader(((HttpsURLConnection)v4).getInputStream()));
                    v6_1 = new StringBuilder();
                    goto label_40;
                }

                this.exception = new Exception("Invalid HTTP Response");
                if(v4 == null) {
                    return v0;
                }
            }
            catch(Exception v5) {
                goto label_63;
            }
            catch(Throwable v5_1) {
                goto label_74;
            }

            goto label_71;
            try {
                while(true) {
                label_40:
                    v1 = v5_4.readLine();
                    if(v1 == null) {
                        break;
                    }

                    v6_1.append(v1 + '\n');
                }

                v6_2 = new JSONObject(v6_1.toString());
                if(v4 != null) {
                    goto label_54;
                }

                return v6_2;
            }
            catch(Exception v5) {
                goto label_63;
            }
            catch(Throwable v5_1) {
                goto label_74;
            }

        label_54:
            ((HttpsURLConnection)v4).disconnect();
            return v6_2;
        }
        catch(Exception v5) {
        label_68:
            v4 = ((URLConnection)v0);
            goto label_69;
        }

    label_74:
        if(v4 != null) {
            ((HttpsURLConnection)v4).disconnect();
        }

        throw v5_1;
    }

    public void shieldOAuth2PostAction(JSONObject arg8, ShieldOAuth2Callback arg9) {
        MobileAuthState v0 = new MobileAuthState();
        if(arg8 != null) {
            try {
                v0.setAccessToken(arg8.getString("access_token"));
                v0.setRefreshToken(arg8.getString("refresh_token"));
                v0.setAccessTokenExpiration(System.currentTimeMillis() + arg8.getLong("expires_in") * 1000);
            }
            catch(JSONException v8) {
                this.exception = ((Exception)v8);
            }
        }

        arg9.onShieldOAuth2Result(new CommsResult(v0, CommsUtils.mapResponseCode(this.responseCode)), this.exception);
    }
}

