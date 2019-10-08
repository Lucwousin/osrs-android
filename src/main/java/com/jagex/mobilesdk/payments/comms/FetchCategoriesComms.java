package com.jagex.mobilesdk.payments.comms;

import android.os.AsyncTask;
import com.google.gson.Gson;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.model.Shop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Set;

public class FetchCategoriesComms extends AsyncTask {
    public interface FetchCategoriesCallback {
        void onFetchPackagesResult(CommsResult arg1, Exception arg2);
    }

    private FetchCategoriesCallback callback;
    private Exception exception;
    private Map headers;
    private int responseCode;
    private String url;

    FetchCategoriesComms(String arg2, Map arg3, FetchCategoriesCallback arg4) {
        super();
        this.responseCode = 0;
        this.url = arg2;
        this.headers = arg3;
        this.callback = arg4;
    }

    protected Shop doInBackground(Void[] arg2) {
        return this.fetchCategoriesAction(this.url, this.headers);
    }

    protected Object doInBackground(Object[] arg1) {
        return this.doInBackground(((Void[])arg1));
    }

    public Shop fetchCategoriesAction(String arg5, Map arg6) {
        Object v6_5;
        StringBuilder v1_1;
        BufferedReader v6_4;
        Set v6_2;
        URLConnection v5;
        Shop v0 = null;
        try {
            v5 = new URL(arg5).openConnection();
        }
        catch(Exception v6) {
            goto label_58;
        }
        catch(Throwable v6_1) {
            goto label_55;
        }

        try {
            v6_2 = arg6.entrySet();
            goto label_5;
        }
        catch(Throwable v6_1) {
        }
        catch(Exception v6) {
        label_53:
            try {
            label_59:
                this.exception = v6;
                if(v5 == null) {
                    return v0;
                }
            }
            catch(Throwable v6_1) {
                goto label_64;
            }

        label_61:
            ((HttpURLConnection)v5).disconnect();
            return v0;
        }
        catch(Throwable v6_1) {
        label_55:
            v5 = ((URLConnection)v0);
            goto label_64;
            try {
            label_5:
                Iterator v6_3 = v6_2.iterator();
                while(v6_3.hasNext()) {
                    Object v1 = v6_3.next();
                    ((HttpURLConnection)v5).setRequestProperty(((Map$Entry)v1).getKey(), ((Map$Entry)v1).getValue());
                }

                ((HttpURLConnection)v5).setRequestMethod("GET");
                ((HttpURLConnection)v5).connect();
                this.responseCode = ((HttpURLConnection)v5).getResponseCode();
                if(this.responseCode == 200) {
                    v6_4 = new BufferedReader(new InputStreamReader(((HttpURLConnection)v5).getInputStream()));
                    v1_1 = new StringBuilder();
                    goto label_28;
                }

                this.exception = new Exception("Invalid HTTP Response");
                if(v5 == null) {
                    return v0;
                }
            }
            catch(Exception v6) {
                goto label_53;
            }
            catch(Throwable v6_1) {
                goto label_64;
            }

            goto label_61;
            try {
                while(true) {
                label_28:
                    String v2 = v6_4.readLine();
                    if(v2 == null) {
                        break;
                    }

                    v1_1.append(v2 + '\n');
                }

                v6_5 = new Gson().fromJson(v1_1.toString(), Shop.class);
                if(v5 != null) {
                    goto label_44;
                }

                goto label_45;
            }
            catch(Exception v6) {
                goto label_53;
            }
            catch(Throwable v6_1) {
                goto label_64;
            }

        label_44:
            ((HttpURLConnection)v5).disconnect();
        label_45:
            return ((Shop)v6_5);
        }
        catch(Exception v6) {
        label_58:
            v5 = ((URLConnection)v0);
            goto label_59;
        }

    label_64:
        if(v5 != null) {
            ((HttpURLConnection)v5).disconnect();
        }

        throw v6_1;
    }

    public void fetchCategoriesPostAction(Shop arg3, FetchCategoriesCallback arg4) {
        arg4.onFetchPackagesResult(new CommsResult(arg3, this.responseCode), this.exception);
    }

    protected void onPostExecute(Shop arg2) {
        this.fetchCategoriesPostAction(arg2, this.callback);
    }

    protected void onPostExecute(Object arg1) {
        this.onPostExecute(((Shop)arg1));
    }
}

